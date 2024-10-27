package Map.Ordenacao;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.TreeMap;

public class LivrariaOnline {
    public Map<String,Livro> livrosMap;

    public LivrariaOnline() {
        this.livrosMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
       livrosMap.put(link, new Livro(titulo,autor,preco));
    }

    public void removerLivro(String titulo) {
        for (Entry<String, Livro> entry :livrosMap.entrySet()) {
            if (Objects.equals(entry.getValue().getTitulo(), titulo)) {
                livrosMap.remove(entry);
                break;
            }
        }
    }

    public Map<String,Livro> exibirLivrosPorPreco() {
        Map<String,Livro> livrosOrdenados = new TreeMap<>(livrosMap);
        return livrosOrdenados;
    }

    public Map<String,Livro> pesquisarLivroPorAutor(String autor) {
        Map<String,Livro> livrosPorAutor = null;
        for (Entry<String,Livro> entry : livrosMap.entrySet()) {
            if (Objects.equals(entry.getValue().getAutor(), autor)) {
                livrosPorAutor.put(entry.getKey(), entry.getValue());
            }
        }

        return livrosPorAutor;
    }

    public Livro obterLivroMaisCaro() {
        Livro livroMaisCaro = new Livro("null","null",0);
        for (Livro l : livrosMap.values()) {
           if (l.getPreco() > livroMaisCaro.getPreco()) {
               livroMaisCaro = l;
           }
        }

        return livroMaisCaro;
    }
}
