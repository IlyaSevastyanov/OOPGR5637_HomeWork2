package classes;

public class PromotionalClient extends Actor {

    private String promoOfTheDay;
    private int idPromoClient;
    static int countPromo;


    public PromotionalClient(String name, int idPromoClient) {
        super(name);
        this.idPromoClient = idPromoClient;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public boolean isTakeOrder() {
        return  super.isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return  super.isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean isCreated) {
        super.isTakeOrder = isCreated;

    }

    @Override
    public void setMakeOrder(boolean isCreated) {
        super.isMakeOrder = isCreated;

    }

    @Override
    public Actor getActor() {
        return this;
    }
}
