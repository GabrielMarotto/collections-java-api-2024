package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    public Map<String, Integer> contagemPalavras;

    public ContagemPalavras() {
        this.contagemPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemPalavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        for (String p : contagemPalavras.keySet()) {
            if (p.equalsIgnoreCase(palavra)) {
                contagemPalavras.remove(palavra);
                break;
            }
        }
    }

    public int exibirContagemPalavras() {
        int contagemTotal = 0;
        for (Integer v : contagemPalavras.values()) {
            contagemTotal += v;
        }

        return contagemTotal;
    }

    public String encontrarPalavraMaisFrequente() {
        String linguagemMaisFrequente = null;
        Integer maiorContagem = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : contagemPalavras.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                linguagemMaisFrequente = entry.getKey();
            }
        }

        return linguagemMaisFrequente;
    }
}
