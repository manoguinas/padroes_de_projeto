package booking;

public class HotelBooking {
    private String detalhes;

    public double bookHotel(int tipoQuarto) {
        double precoBase = 200;
        double preco = 0;
        switch (tipoQuarto) {
            case 1: preco = precoBase; break;
            case 2: preco = precoBase * 1.5; break;
            case 3: preco = precoBase * 1.5 * 3; break;
        }
        detalhes = String.format("Quarto %s", new String[]{"Simples", "Executivo", "Suíte Presidencial"}[tipoQuarto - 1]);
        return preco;
    }

    public String getDetalhes() {
        return detalhes;
    }
}
