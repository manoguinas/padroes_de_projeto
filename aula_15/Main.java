public class Main {
    public static void main(String[] args) {
        VideoPlataforma netflixClone = new VideoPlataforma();

        Usuario user1 = new Usuario("Aguinaldo");
        Usuario user2 = new Usuario("Geralda");
        Usuario user3 = new Usuario("Luísa");
        Usuario user4 = new Usuario("Lucas");
        Usuario user5 = new Usuario("Fernando");

        user1.inscreverNoGenero("ação");
        user2.inscreverNoGenero("comédia");
        user3.inscreverNoGenero("terror");
        user4.inscreverNoGenero("anime");
        user5.inscreverNoGenero("ficção científica");

        netflixClone.anexar(user1);
        netflixClone.anexar(user2);
        netflixClone.anexar(user3);
        netflixClone.anexar(user4);
        netflixClone.anexar(user5);

        netflixClone.addFilme("Matrix", "ficção científica");
        netflixClone.addFilme("Vingadores", "ação");
        netflixClone.addFilme("O Massacre da Serra Elétrica", "terror");
        netflixClone.addFilme("Naruto", "anime");
        netflixClone.addFilme("Se Beber, Não Case", "comédia");
    }
}
