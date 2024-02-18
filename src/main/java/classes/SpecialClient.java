package classes;

/**
 * Класс  описывает структуру особого клиента в магазине.Является потомком класса Actor.
 */
public class SpecialClient extends Actor {
    private int idVip;

    public SpecialClient(String name, int idVip) {
        super(name);
        this.idVip = idVip;
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

    /**
     * Метод возвращает имя клиента
     * @return имя клиента
     */
    public String getName() {
        return super.name;
    }

    /**
     * Метод задает имя клиенту
     * @param  name  задаваемое имя клиента
     */
    @Override
    public void setName(String name) {
        super.name = name;
    }
}


