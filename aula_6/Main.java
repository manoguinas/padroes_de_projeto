import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de violão:");
        System.out.println("1 - Clássico");
        System.out.println("2 - Folk");
        System.out.println("3 - Flet");
        System.out.println("4 - Jumbo");
        System.out.println("5 - Violão 7 cordas");
        System.out.println("6 - Violão 12 cordas");
        System.out.println("7 - Violões Zero, Duplo Zero e Triplo Zero");
        int escolha = scanner.nextInt();

        Violao violao1 = new Violao("Clássico", "Nylon", "Leve");

        try {
            switch (escolha) {
                case 1:
                    violao1 = new Violao("Clássico", "Nylon", "Leve");
                    violao1.exibirInfo();
                    break;
                case 2:
                    Violao violao2 = violao1.clone();
                    violao2.setTipo("Violão Folk");
                    violao2.setCordas("Aço");
                    violao2.setTimbre("Encorpado");
                    violao2.exibirInfo();
                    break;
                case 3:
                    Violao violao3 = violao1.clone();
                    violao3.setTipo("Violão Flet");
                    violao3.setCordas("Nylon");
                    violao3.setTimbre("Suave");
                    violao3.exibirInfo();
                    break;
                case 4:
                    Violao violao4 = violao1.clone();
                    violao4.setTipo("Violão Jumbo");
                    violao4.setCordas("Aço");
                    violao4.setTimbre("Grave e encorpado");
                    violao4.exibirInfo();
                    break;
                case 5:
                    Violao violao5 = violao1.clone();
                    violao5.setTipo("Violão 7 Cordas");
                    violao5.setCordas("Nylon");
                    violao5.setTimbre("Leve");
                    violao5.exibirInfo();
                    break;
                case 6:
                    Violao violao6 = violao1.clone();
                    violao6.setTipo("Violão 12 Cordas");
                    violao6.setCordas("Duplas (metade afinadas com uma oitava acima)");
                    violao6.setTimbre("Ressonância plena");
                    violao6.exibirInfo();
                    break;
                case 7:
                    Violao violao7 = violao1.clone();
                    violao7.setTipo("Violões Zero, Duplo Zero e Triplo Zero");
                    violao7.setCordas("Nylon");
                    violao7.setTimbre("Leve");
                    violao7.exibirInfo();
                    break;
                default:
                    break;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}