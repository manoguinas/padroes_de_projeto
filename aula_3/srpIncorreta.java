class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double calcularDesconto(double percentualDesconto) {
        return preco * (1 - percentualDesconto / 100);
    }

    public void salvarNoBancoDeDados() {
        System.out.println("Salvando produto " + nome + " no banco de dados.");
    }
}

/*
 * A classe Produto tem duas responsabilidades diferentes:
 * Calcular descontos.
 * Salvar o produto no banco de dados.
 */

