class ConstrutorSanduichePadrao implements ConstrutorSanduiche {
    private Sanduiche sanduiche;

    public ConstrutorSanduichePadrao() {
        this.sanduiche = new Sanduiche();
    }

    @Override
    public void construirPao() {
        sanduiche.setPao("Pão Francês");
    }

    @Override
    public void construirCarne() {
        sanduiche.setCarne("Presunto");
    }

    @Override
    public void construirQueijo() {
        sanduiche.setQueijo("Queijo Suíço");
    }

    @Override
    public void construirIngredientesExtras() {
        sanduiche.getIngredientesExtras().add("Alface");
        sanduiche.getIngredientesExtras().add("Tomate");
        sanduiche.getIngredientesExtras().add("Maionese");
    }

    @Override
    public Sanduiche getSanduiche() {
        return sanduiche;
    }
}