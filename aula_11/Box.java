import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Box implements Item {
    private String level;
    private int itemCount;
    private List<Item> items;
    private double totalPrice;

    public Box(String level, int itemCount) {
        this.level = level;
        this.itemCount = itemCount;
        this.items = new ArrayList<>();
        this.totalPrice = 0.0;
        fillBox();
    }

    private void fillBox() {
        Item[] itemClasses = {
            new Quadrinho(), new Chaveiro(), new Busto(),
            new Adesivo(), new Poster(), new Camiseta(),
            new Caneta(), new Miniatura()
        };
        Random random = new Random();
        for (int i = 0; i < itemCount; i++) {
            Item item = itemClasses[random.nextInt(itemClasses.length)];
            items.add(item);
            totalPrice += item.getPrice();
        }
    }

    @Override
    public String getName() {
        return "Caixa " + level;
    }

    @Override
    public double getPrice() {
        return totalPrice;
    }

    public List<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        StringBuilder itemList = new StringBuilder();
        for (Item item : items) {
            itemList.append(item.getName()).append(" (R$ ").append(String.format("%.2f", item.getPrice())).append("), ");
        }
        return getName() + " contém: " + itemList + "\nValor total: R$ " + String.format("%.2f", getPrice());
    }
}
