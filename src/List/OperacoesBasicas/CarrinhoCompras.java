package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    public List<Item> itemList;

    public CarrinhoCompras() {
        this.itemList = new ArrayList<>();
    }

     public void adicionarItem(String nome, double preço, int quantidade) {
        itemList.add(new Item(nome,preço,quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemParaRemover = new ArrayList<>();
        for (Item i : itemList) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itemParaRemover.add(i);
            }
        }
        itemList.removeAll(itemParaRemover);
    }

    public double calcularValorTotal() {
        int precoTotal = 0;
        for (Item i : itemList) {
            precoTotal +=  (double) (i.getPreço() * i.getQuantidade());
        }
        return precoTotal;
    }

    public void exibirItens() {
        for (Item i : itemList) {
            System.out.println("Nome: " + i.getNome());
            System.out.println("Preço: " + i.getPreço());
            System.out.println("Quantidade: " + i.getQuantidade());
        }
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

        carrinhoCompras.exibirItens();
        carrinhoCompras.adicionarItem("Banana",5.9,12);
        carrinhoCompras.adicionarItem("Salmão",25.9,3);


        carrinhoCompras.removerItem("Salmão");
        carrinhoCompras.adicionarItem("Frango",20.0,1);

        carrinhoCompras.exibirItens();

        System.out.println(carrinhoCompras.calcularValorTotal());
    }
}