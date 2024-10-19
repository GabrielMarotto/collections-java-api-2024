package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    private void adicionarNumero (Integer numero) {
        numeros.add(numero);
    }

    private Integer calcularSoma() {
        Integer total = 0;
        for (Integer n : numeros) {
            total += n;
        }
        return total;
    }

    private Integer encontrarMaiorNumero() {
        Integer maiorNumero = 0;
        for (Integer n : numeros) {
            if (n > maiorNumero) {
                maiorNumero = n;
            }
        }
        return maiorNumero;
    }

    private Integer encontrarMenorNumero() {
        Integer menorNumero = 999999999;
        for (Integer n : numeros) {
            if (n < menorNumero) {
                menorNumero= n;
            }
        }
        return menorNumero;
    }

    private void exibirNumeros() {
        for (Integer n : numeros) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(6);

        somaNumeros.exibirNumeros();

        System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());
        System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Soma: " + somaNumeros.calcularSoma());
    }
}
