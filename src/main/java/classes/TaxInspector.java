package classes;

import interfaces.iActorBehaviour;

public class TaxInspector  implements iActorBehaviour {
    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;

    public TaxInspector() {
        this.name = "Налоговый инспектор";
    }

    public Actor getActor() {
        return new OrdinaryClient("Тайный клиент");
    }

    public boolean isTakeOrder() {
        return isTakeOrder;

    }

    public boolean isMakeOrder() {
        return isMakeOrder;

    }

    public void setMakeOrder(boolean isCreated) {
        isMakeOrder = isCreated;

    }

    public void setTakeOrder(boolean isCreated) {
        isTakeOrder = isCreated;

    }

}
