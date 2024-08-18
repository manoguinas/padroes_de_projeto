
public class BasicSubscription implements Subscription {
    private String description = "Assinatura Base: Assistir vídeos num único dispositivo";
    private double cost = 9.99;

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        return cost;
    }
}
