package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    public Set<String> palavraSet;

    public ConjuntoPalavrasUnicas () {
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavraSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (palavraSet.isEmpty()) {
            System.out.println("Set de palavras vazio");
            return;
        }
        if (palavraSet.contains(palavra)) {
            palavraSet.remove(palavra);

        }
    }

    public void verificarPalavra (String palavra) {
        String palavraVerificada = null;
        for (String p : palavraSet) {
            if (p == palavra) {
                palavraVerificada = p;
                break;
            }
        }
        if (palavraVerificada == null) {
            throw new RuntimeException("Palavra não se encontra no Set");
        } else {
            System.out.println("Palavra " + palavraVerificada + " está no conjunto");
        }
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavraSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("A");
        conjuntoPalavrasUnicas.adicionarPalavra("B");
        conjuntoPalavrasUnicas.adicionarPalavra("C");
        conjuntoPalavrasUnicas.adicionarPalavra("D");
        conjuntoPalavrasUnicas.adicionarPalavra("E");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("C");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.verificarPalavra("X");
    }
}

