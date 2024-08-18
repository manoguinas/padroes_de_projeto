package facade;

import booking.FlightBooking;
import booking.HotelBooking;
import rental.CarRental;
import payment.PaymentSystem;

public class TravelFacade {
    private FlightBooking flightBooking = new FlightBooking();
    private HotelBooking hotelBooking = new HotelBooking();
    private CarRental carRental = new CarRental();
    private PaymentSystem paymentSystem = new PaymentSystem();
    private String detalhesCompra = "";

    public double comprarPacote(String nome, String cpf, int classeVoo, int fileira, String assento,
                                int tipoQuarto, int tipoCarro, int formaPagamento, int parcelas) {
        double precoVoo = flightBooking.bookFlight(classeVoo, fileira, assento);
        double precoHotel = hotelBooking.bookHotel(tipoQuarto);
        double precoCarro = carRental.rentCar(tipoCarro);

        double valorTotal = precoVoo + precoHotel + precoCarro;
        double valorFinal = paymentSystem.processPayment(valorTotal, formaPagamento, parcelas);

        detalhesCompra = String.format("Nome: %s\nCPF: %s\n%s\n%s\n%s\nForma de Pagamento: %s",
            nome, cpf, flightBooking.getDetalhes(), hotelBooking.getDetalhes(), carRental.getDetalhes(),
            new String[]{"PIX", "Boleto", "Débito", "Crédito"}[formaPagamento - 1]);

        if (formaPagamento == 4) {
            detalhesCompra += String.format(" em %dx", parcelas);
        }

        return valorFinal;
    }

    public void exibirDetalhesCompra() {
        System.out.println(detalhesCompra);
    }
}
