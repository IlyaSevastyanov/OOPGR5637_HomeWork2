package classes;

public class OrdinaryClient extends Actor {
    public OrdinaryClient(String name) {
        super(name);
    }


    public boolean isTakeOrder(){
        return  super.isTakeOrder;

    }
    public boolean isMakeOrder(){
        return isMakeOrder;

    }
    public void setMakeOrder(boolean isCreated){
        super.isMakeOrder = isCreated;

    }
    public void setTakeOrder(boolean isCreated){
        super.isTakeOrder = isCreated;

    }
    public Actor getActor() {
        return this;
    }
    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }
}
