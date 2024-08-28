import java.util.ArrayList;
import java.util.List;

public class Usuario implements Observer {
    private String nome;
    private List<String> inscritosGeneros = new ArrayList<>();

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void inscreverNoGenero(String genero) {
        inscritosGeneros.add(genero);
    }

    @Override
    public void update(String title, String genero) {
        if (inscritosGeneros.contains(genero)) {
            System.out.println(nome + " foi notificado: Novo conteúdo adicionado - " + title + " [Gênero: " + genero + "]");
        }
    }
}
