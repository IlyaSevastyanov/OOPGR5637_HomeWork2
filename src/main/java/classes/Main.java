package classes;

import classes.Actor;
import classes.Market;
import classes.OrdinaryClient;
import classes.SpecialClient;

public class Main {
    public static void main(String[] args) {
        Market magnit = new Market();
        Actor client1 = new OrdinaryClient("Tolik");
        Actor client2 = new OrdinaryClient("Any");
        Actor client3 = new SpecialClient("President",777);
        Actor client4 = new PromotionalClient("Edward",22);
        TaxInspector client5 = new TaxInspector();
        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);
        magnit.update();

    }

}
