package classes;

public class Main {
    public static void main(String[] args) {
        Market magnit = new Market();
        Actor client1 = new OrdinaryClient("Tolik");
        Actor client2 = new OrdinaryClient("Any");
        Actor client3 = new SpecialClient("President", 777);
        TaxInspector client4 = new TaxInspector();
        PromotionalClient client5 = new PromotionalClient("Edward", 22);
        PromotionalClient.setCountPromoClient(23);
        client5.setNameOfAction("EVERY 2 NUTS FREE");
        client5.showCurrentPromo();
        client5.setNameOfAction("10%  oil");
        PromotionalClient.setCountPromoClient(3);
        client5.showCurrentPromo();

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);
        magnit.update();

    }
}
