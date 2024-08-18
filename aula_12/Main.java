import facade.TravelFacade;

public class Main {
    public static void main(String[] args) {
        TravelFacade facade = new TravelFacade();

        System.out.println("Bem-vindo ao sistema de venda de pacotes de viagem!\n");
        String nome = System.console().readLine("Digite o seu nome: ");
        String cpf = System.console().readLine("Digite o seu CPF: ");

        System.out.println("\nEscolha o tipo de voo:");
        System.out.println("1. Classe Econômica");
        System.out.println("2. Classe Executiva");
        System.out.println("3. Primeira Classe");
        int classeVoo = Integer.parseInt(System.console().readLine("Opção: "));

        int fileira = Integer.parseInt(System.console().readLine("\nEscolha a fileira do assento (1 a 32): "));
        String assento = System.console().readLine("Escolha o assento (A a F): ").toUpperCase();

        System.out.println("\nEscolha o tipo de quarto de hotel:");
        System.out.println("1. Simples");
        System.out.println("2. Executivo");
        System.out.println("3. Suíte Presidencial");
        int tipoQuarto = Integer.parseInt(System.console().readLine("Opção: "));

        System.out.println("\nEscolha o tipo de carro para aluguel:");
        System.out.println("1. Econômico");
        System.out.println("2. Executivo");
        System.out.println("3. Luxo");
        int tipoCarro = Integer.parseInt(System.console().readLine("Opção: "));

        System.out.println("\nEscolha a forma de pagamento:");
        System.out.println("1. PIX (10% de desconto)");
        System.out.println("2. Boleto (5% de desconto)");
        System.out.println("3. Débito (sem desconto)");
        System.out.println("4. Crédito (até 6x com juros)");
        int formaPagamento = Integer.parseInt(System.console().readLine("Opção: "));
        int parcelas = 1;
        if (formaPagamento == 4) {
            parcelas = Integer.parseInt(System.console().readLine("Em quantas parcelas? (1 a 6): "));
        }

        double total = facade.comprarPacote(
            nome, cpf, classeVoo, fileira, assento,
            tipoQuarto, tipoCarro, formaPagamento, parcelas
        );

        System.out.println("\nResumo da Compra:\n");
        facade.exibirDetalhesCompra();
        System.out.printf("Valor Total do Pacote: R$ %.2f%n", total);
    }
}
