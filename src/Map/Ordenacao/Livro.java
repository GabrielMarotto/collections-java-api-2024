package Map.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Livro implements Comparable<Livro> {
    public String titulo;
    public String autor;
    public double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public int compareTo(Livro l) {
        return Double.compare(preco, l.getPreco());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Double.compare(preco, livro.preco) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(preco);
    }
}
