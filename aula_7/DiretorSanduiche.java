class DiretorSanduiche {
    private ConstrutorSanduiche construtor;

    public DiretorSanduiche(ConstrutorSanduiche construtor) {
        this.construtor = construtor;
    }

    public void construirSanduiche() {
        construtor.construirPao();
        construtor.construirCarne();
        construtor.construirQueijo();
        construtor.construirIngredientesExtras();
    }

    public Sanduiche getSanduiche() {
        return construtor.getSanduiche();
    }
}