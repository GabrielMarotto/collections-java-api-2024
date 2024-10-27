package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String,String> dicionarioMap;

    public Dicionario () {
        this.dicionarioMap = new HashMap<>();
    }

    private void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra,definicao);
    }

    private void removerPalavra(String palavra) {
        dicionarioMap.remove(palavra);
    }

    private void exibirPalavras() {
        System.out.println(dicionarioMap);
    }

    private String pesquisarPorPalavra (String palavra) {
        if (dicionarioMap.isEmpty()) {
            throw new RuntimeException("Map vazio");
        }

        return dicionarioMap.get(palavra);
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Água", "Líquido bom para beber");
        dicionario.adicionarPalavra("Massa", "Comida rica em carboidratos");

        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisarPorPalavra("Água"));

        dicionario.removerPalavra("Água");

        dicionario.exibirPalavras();
    }
}
