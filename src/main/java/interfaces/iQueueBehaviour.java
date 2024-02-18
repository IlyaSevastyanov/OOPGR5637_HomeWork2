package interfaces;

/**
 * Интерфейс описывает поведение клиентов в очереди
 */
public interface iQueueBehaviour {
    public void takeInQueue(iActorBehaviour actor); // метод входа в очередь
    public void releaseFromQueue(); // метод ухода в очередь
    public void takeOrder(); // метод оформления заказа
    public void giveOrder(); // метод получения заказа

}
