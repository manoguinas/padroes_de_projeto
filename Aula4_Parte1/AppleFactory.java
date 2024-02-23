package Aula4Atv1;
class AppleFactory implements EletronicosFactory {
    @Override
    public Produto criarSmartphone() {
        return new iPhone();
    }

    @Override
    public Produto criarTablet() {
        return new iPad();
    }

    @Override
    public Produto criarLaptop() {
        return new MacBook();
    }
}