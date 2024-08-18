
public class SurpriseBoxPackage extends SubscriptionDecorator {
    public SurpriseBoxPackage(Subscription subscription) {
        super(subscription);
    }

    @Override
    public String getDescription() {
        return subscription.getDescription() + ", Caixa surpresa com produtos relacionados a filmes e séries";
    }

    @Override
    public double getCost() {
        return subscription.getCost() + 29.99;
    }
}
