
public class MultiDevicePackage extends SubscriptionDecorator {
    public MultiDevicePackage(Subscription subscription) {
        super(subscription);
    }

    @Override
    public String getDescription() {
        return subscription.getDescription() + ", Assistir vídeos em vários dispositivos";
    }

    @Override
    public double getCost() {
        return subscription.getCost() + 19.99;
    }
}
