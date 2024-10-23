package Set.Ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    private void adicionarAluno (String nome, Long matricula, Double media) {
        alunoSet.add(new Aluno(nome,matricula,media));
    }

    private void removerAluno(Long matricula) {
        if (alunoSet.isEmpty()) {
            throw new RuntimeException("Nenhum aluno registrado");
        }

        for (Aluno a : alunoSet) {
            if (a.getMatricula().equals(matricula)) {
                alunoSet.remove(a);
                break;
            }
        }
    }

    private Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);

        if (alunoSet.isEmpty()) {
            throw new RuntimeException("Nenhum aluno cadastrado");
        }

        return alunosPorNome;
    }

    private Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorMedia());

        if (alunosPorNota.isEmpty()) {
            throw new RuntimeException("Nenhum aluno registrado");
        }

        alunosPorNota.addAll(alunoSet);
        return alunosPorNota;
    }

    private void exibirAlunos() {
        System.out.println(alunoSet);
    }
}
