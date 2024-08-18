package booking;

public class FlightBooking {
    private String detalhes;

    public double bookFlight(int classe, int fileira, String assento) {
        double precoBase = 500;
        double preco = 0;
        switch (classe) {
            case 1: preco = precoBase; break;
            case 2: preco = precoBase * 2.5; break;
            case 3: preco = precoBase * 2.5 * 1.5; break;
        }
        detalhes = String.format("Classe %s Assento %d%s", new String[]{"Econômica", "Executiva", "Primeira"}[classe - 1], fileira, assento);
        return preco;
    }

    public String getDetalhes() {
        return detalhes;
    }
}
