import java.util.ArrayList;
import java.util.List;

abstract class DisciplinaAbstrata {
    protected List<String> alunosMatriculados = new ArrayList<>();

    public abstract void matricularAluno(String nome);
    public abstract void exibirMatriculados();
}

class DisciplinaClasseAbs extends DisciplinaAbstrata {
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

public class matriculaAbstrata {
    public static void main(String[] args) {
        DisciplinaAbstrata disciplina = new DisciplinaClasseAbs();
        disciplina.matricularAluno("João");
        disciplina.matricularAluno("Maria");
        disciplina.exibirMatriculados();
    }
}
