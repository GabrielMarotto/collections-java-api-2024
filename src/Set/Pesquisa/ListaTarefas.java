package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas () {
        this.tarefaSet = new HashSet<>();
    }

    private void adicionarTarefa (String descricao) {
        tarefaSet.add(new Tarefa(descricao, false));
    }

    private void removerTarefa (String descricao) {
        if (tarefaSet.isEmpty()) {
            throw new RuntimeException("Sem tarefas");
        }

        for (Tarefa t : tarefaSet) {
            if (t.descricao == descricao) {
                tarefaSet.remove(t);
                break;
            }
        }
    }

    private void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    private int contarTarefas() {
        return tarefaSet.size();
    }

    private Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        for (Tarefa t : tarefaSet) {
            if (t.concluido) {
                tarefasConcluidas.add(t);
            }
        }

        return tarefasConcluidas;
    }

    private Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        for (Tarefa t : tarefaSet) {
            if (!t.concluido) {
                tarefasPendentes.add(t);
            }
        }

        return tarefasPendentes;
    }

    private void marcarTarefaConcluida(String descricao) {

        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluido(true);
                break;
            }
        }
    }

    private void marcarTarefaPendente(String descricao) {

        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluido(false);
                break;
            }
        }
    }

    private void limparListaTarefas() {
        tarefaSet = new HashSet<>();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Lavar pratos");
        listaTarefas.adicionarTarefa("Estudar");
        listaTarefas.adicionarTarefa("Trabalhar");
        listaTarefas.adicionarTarefa("Consertar porta");

        System.out.println(listaTarefas.contarTarefas() + " tarefas na lista");
        listaTarefas.exibirTarefas();

        System.out.println("Tarefas concluidas: " + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaConcluida("Trabalhar");
        System.out.println("Tarefas concluidas: " + listaTarefas.obterTarefasConcluidas());

        listaTarefas.marcarTarefaPendente("Trabalhar");
        System.out.println("Tarefas concluidas: " + listaTarefas.obterTarefasConcluidas());
    }
}
