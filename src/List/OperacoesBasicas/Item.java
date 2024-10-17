package List.OperacoesBasicas;

public class Item {
    private String nome;
    private double preço;
    private int quantidade;

    public Item (String nome, double preço, int quantidade) {
        this.nome = nome;
        this.preço = preço;
        this.quantidade= quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreço() {
        return preço;
    }

    public String getNome() {
        return nome;
    }
}
