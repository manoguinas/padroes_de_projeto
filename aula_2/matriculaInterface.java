import java.util.ArrayList;
import java.util.List;

interface Matricula {
    void matricularAluno(String nome);
    void exibirMatriculados();
}

class DisciplinaComInterface implements Matricula {
    private List<String> alunosMatriculados = new ArrayList<>();

    @Override
    public void matricularAluno(String nome) {
        alunosMatriculados.add(nome);
        System.out.println(nome + " matriculado na disciplina.");
    }

    @Override
    public void exibirMatriculados() {
        System.out.println("Alunos matriculados: " + alunosMatriculados);
    }
}

public class matriculaInterface {
    public static void main(String[] args) {
        Matricula disciplina = new DisciplinaComInterface();
        disciplina.matricularAluno("João");
        disciplina.matricularAluno("Maria");
        disciplina.exibirMatriculados();
    }
}
