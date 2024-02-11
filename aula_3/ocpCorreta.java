
interface Desconto {
    double calcularDesconto(Produto produto, double percentualDesconto);
}

class CalculadoraDescontoPadrao implements Desconto {
    public double calcularDesconto(Produto produto, double percentualDesconto) {
        return produto.getPreco() * (1 - percentualDesconto / 100);
    }
}

class CalculadoraDescontoProdutoPremium implements Desconto {
    public double calcularDesconto(Produto produto, double percentualDesconto) {
        return produto.getPreco() * (1 - (percentualDesconto + 10) / 100);
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

public class ocpCorreta {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 2500.00);

        Desconto calculadoraDesconto = new CalculadoraDescontoPadrao();
        double precoComDesconto = calculadoraDesconto.calcularDesconto(produto, 10);

        System.out.println("Preço com desconto: " + precoComDesconto);

        Produto produtoPremium = new Produto("Smartphone", 1500.00);

        calculadoraDesconto = new CalculadoraDescontoProdutoPremium();
        double precoComDescontoPremium = calculadoraDesconto.calcularDesconto(produtoPremium, 10);

        System.out.println("Preço com desconto (Produto Premium): " + precoComDescontoPremium);
    }
}