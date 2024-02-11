class CalculadoraDesconto {
    public double calcularDesconto(Produto produto, double percentualDesconto) {
        if (produto instanceof ProdutoPremium) {
            return produto.getPreco() * (1 - (percentualDesconto + 10) / 100);
        } else {
            return produto.getPreco() * (1 - percentualDesconto / 100);
        }
    }
}

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

class ProdutoPremium extends Produto {
    public ProdutoPremium(String nome, double preco) {
        super(nome, preco);
    }
}

public class ocpIncorreta {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 2500.00);

        CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();
        double precoComDesconto = calculadoraDesconto.calcularDesconto(produto, 10);

        System.out.println("Preço com desconto: " + precoComDesconto);

        ProdutoPremium produtoPremium = new ProdutoPremium("Smartphone", 1500.00);
        double precoComDescontoPremium = calculadoraDesconto.calcularDesconto(produtoPremium, 10);

        System.out.println("Preço com desconto (Produto Premium): " + precoComDescontoPremium);
    }
}

/*
 * Para adicionar um novo tipo de produto com um comportamento de desconto diferente,
 * precisaríamos modificar a classe CalculadoraDesconto, o que vai contra o princípio de estar
 * fechada para modificação.
 */

