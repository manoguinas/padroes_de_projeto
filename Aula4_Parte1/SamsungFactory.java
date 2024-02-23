package Aula4Atv1;
class SamsungFactory implements EletronicosFactory {
    @Override
    public Produto criarSmartphone() {
        return new GalaxyPhone();
    }

    @Override
    public Produto criarTablet() {
        return new GalaxyTab();
    }

    @Override
    public Produto criarLaptop() {
        return new GalaxyBook();
    }
}