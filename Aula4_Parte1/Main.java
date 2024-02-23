package Aula4Atv1;

public class Main {
  public static void main(String[] args) {
    EletronicosFactory AppleFactory = new AppleFactory();

    Produto iphone = AppleFactory.criarSmartphone();
    Produto ipad = AppleFactory.criarTablet();
    Produto macbook = AppleFactory.criarLaptop();

    iphone.exibirInfo();
    ipad.exibirInfo();
    macbook.exibirInfo();

    EletronicosFactory SamsungFactory = new SamsungFactory();

    Produto galaxyPhone = SamsungFactory.criarSmartphone();
    Produto galaxyTab = SamsungFactory.criarTablet();
    Produto galaxyBook = SamsungFactory.criarLaptop();

    galaxyPhone.exibirInfo();
    galaxyTab.exibirInfo();
    galaxyBook.exibirInfo();
  }
}