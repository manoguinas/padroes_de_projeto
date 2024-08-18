package rental;

public class CarRental {
    private String detalhes;

    public double rentCar(int tipoCarro) {
        double precoBase = 150;
        double preco = 0;
        switch (tipoCarro) {
            case 1: preco = precoBase; break;
            case 2: preco = precoBase * 2; break;
            case 3: preco = precoBase * 2 * 2; break;
        }
        detalhes = String.format("Carro %s", new String[]{"Econômico", "Executivo", "Luxo"}[tipoCarro - 1]);
        return preco;
    }

    public String getDetalhes() {
        return detalhes;
    }
}
