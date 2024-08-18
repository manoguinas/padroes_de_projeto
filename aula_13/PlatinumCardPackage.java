
public class PlatinumCardPackage extends SubscriptionDecorator {
    public PlatinumCardPackage(Subscription subscription) {
        super(subscription);
    }

    @Override
    public String getDescription() {
        return subscription.getDescription() + ", Cartão de crédito Platinum";
    }

    @Override
    public double getCost() {
        return subscription.getCost() + 49.99;
    }
}
