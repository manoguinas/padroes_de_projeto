package payment;

public class PaymentSystem {
    public double processPayment(double valor, int metodoPagamento, int parcelas) {
        double[] descontos = {0.9, 0.95, 1.0};
        if (metodoPagamento == 4) {  // Crédito
            valor *= (1 + 0.0399 * parcelas);
        } else {
            valor *= descontos[metodoPagamento - 1];
        }
        return valor;
    }
}
