package interfaces;

import classes.Actor;

/**
 * Интерфейс описывает поведение клиентов
 */
public interface iActorBehaviour {
    public boolean isTakeOrder(); // проверка на получение заказа
    public boolean isMakeOrder(); // проверка на создание заказа
    public void setTakeOrder(boolean isCreated); // проверка на оформление заказа
    public void setMakeOrder(boolean isCreated);
    public Actor getActor();

}
