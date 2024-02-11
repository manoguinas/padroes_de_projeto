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

class CalculadoraDesconto {
  public double calcularDesconto(Produto produto, double percentualDesconto) {
      return produto.getPreco() * (1 - percentualDesconto / 100);
  }
}

class RepositorioProduto {
  public void salvarNoBancoDeDados(Produto produto) {
      System.out.println("Salvando produto " + produto.getNome() + " no banco de dados.");
  }
}

public class srpCorreta {
  public static void main(String[] args) {
      Produto produto = new Produto("Notebook", 2500.00);

      CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();
      double precoComDesconto = calculadoraDesconto.calcularDesconto(produto, 10);

      System.out.println("Preço com desconto: " + precoComDesconto);

      RepositorioProduto repositorio = new RepositorioProduto();
      repositorio.salvarNoBancoDeDados(produto);
  }
}

