package classes;

/**
 * Класс описывает структуру акционного клиента.
 */
public class PromotionalClient extends Actor {

    private String nameOfPromo;  // название акции
    private int idPromoClient; // ID акционного клиента
    private static int countPromoClient; // количество участников акции


    public PromotionalClient(String name, int idPromoClient) {
        super(name);
        this.idPromoClient = idPromoClient;
    }


    /**
     * Метод получения имени акционного клиента
     * @return возвращает имя акционного клиента
     */

    @Override
    public String getName() {
        return super.name;
    }

    /**
     * Метод присвоения имени акционного клиента
     *
     * @param name задаваемое имя акционного клиента
     */
    @Override
    public void setName(String name) {

    }

    /**
     *
     * Метод для получения флага состояния полученного заказа клиентом
     * @return флаг состояния - клиент получил или не получил заказ
     */

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    /**
     * Метод для получения флага состояния сделанного заказа клиентом
     *
     * @return флаг состояния - клиент сделал или не сделал заказ
     */

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    /**
     * Метод для установки флага состояния полученного заказа клиентом
     *
     * @param isCreated переменная состояния заказа у клиента - получен или не получен
     */

    @Override
    public void setTakeOrder(boolean isCreated) {
        this.isTakeOrder = isCreated;

    }

    /**
     * Метод для установки флага состояния сделанного заказа клиентом
     *
     * @param isCreated переменная состояния заказа у клиента - сделан или не сделан
     */
    @Override
    public void setMakeOrder(boolean isCreated) {
        this.isMakeOrder = isCreated;

    }

    /**
     * Метод получения экземпляра акционного клиента
     * @return возвращает экземпляр акционного клиента
     */

    @Override
    public Actor getActor() {
        return this;
    }

    /**
     * Метод возвращает id клиента
     * @return возвращает id клиента
     */
    public int getID() {
        return idPromoClient;
    }
    /**
     * Метод устанавливает id клиента
     * @param idPromoClient для присвоения id клиенту
     */
    public void setID(int idPromoClient) {
        this.idPromoClient = idPromoClient;
    }

    /**
     * Метод возвращает количество участников акции
     * @return количество участников акции
     */
    public static int getCountPromoClient() {
        return countPromoClient;
    }

    /**
     * Метод задает количество участников акции
     * @param countPromoClient количество участников акции
     */
    public static void setCountPromoClient(int countPromoClient) {
        PromotionalClient.countPromoClient = countPromoClient;

    }

    /**
     * Метод возвращает название акции
     * @return название акции
     */
    public String getNameOfPromo() {
        return nameOfPromo;
    }

    /**
     * Метод задает название акции
     * @param nameOfPromo название акции
     */
    public void setNameOfAction(String nameOfPromo) {
        this.nameOfPromo = nameOfPromo;
    }

    /**
     * Метод показывает, является ли клиент участником текущей акции
     */
    public void showCurrentPromo() {
        if (idPromoClient <= countPromoClient) {
            System.out.println("Клиент " + super.name + " с id:" + this.idPromoClient + " участвует в акции " + this.nameOfPromo);
        } else
            System.out.println("Клиент " + super.name + " с id:" + this.idPromoClient + "  не участвует в акции " + this.nameOfPromo);
    }
}
