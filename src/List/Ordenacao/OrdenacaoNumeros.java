package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    public List<Integer> numeroList;

    public OrdenacaoNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeroList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> listaAscendente = new ArrayList<>(this.numeroList);
        if (!listaAscendente.isEmpty()) {
            Collections.sort(listaAscendente);
        } else {
            throw new RuntimeException("Lista vazia");
        }
        return listaAscendente;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> listaDescendente = new ArrayList<>(this.numeroList);
        if (!listaDescendente.isEmpty()) {
            Collections.sort(listaDescendente, new NumerosComparator());
            Collections.reverse(listaDescendente);
        } else {
            throw new RuntimeException("Lista vazia");
        }
        return listaDescendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(90);
        ordenacaoNumeros.adicionarNumero(8);
        ordenacaoNumeros.adicionarNumero(25);

        System.out.println(ordenacaoNumeros.numeroList);
        System.out.println("Ordenado em ordem ascendente: " + ordenacaoNumeros.ordenarAscendente());
        System.out.println("Ordenado em ordem descendente: " + ordenacaoNumeros.ordenarDescendente());


    }
}
