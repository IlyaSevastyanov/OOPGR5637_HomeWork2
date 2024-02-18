package classes;


import interfaces.iActorBehaviour;
import interfaces.iReturnOrder;

/**
 * Класс описывает структуру абстрактного клиента
 */

public abstract class Actor implements iActorBehaviour, iReturnOrder {
    protected String name;
    protected boolean isTakeOrder; // флаг состояния - клиент получил заказ
    protected boolean isMakeOrder; // флаг состояния - клиент сделал заказ

    public Actor(String name) {
        this.name = name;
    }

    /**
     * Метод возвращает имя клиента
     * @return имя клиента
     */
    public abstract String getName();

    /**
     * Метод задает имя клиенту
     * @param  name  задаваемое имя клиента
     */
    public abstract void setName(String name);

    /**
     * Метод, реализующий отображение возврата заказа клиентом
     */
    @Override
    public void ReturnOrder() {
        if(isMakeOrder) {
            System.out.println(getName() + " клиент вернул заказ");

        }
    }
}