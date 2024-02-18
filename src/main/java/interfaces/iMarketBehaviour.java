package interfaces;
import classes.Actor;

import java.util.List;

/**
 * Интерфейс описывает работу магазина.
 */
public interface iMarketBehaviour {
    public void acceptToMarket(iActorBehaviour actor); // метод входа в магазин
    public void releaseFromMarket(List<Actor> actors); // метод ухода из магазина
    public void update(); // метод передвижения между состояниями

}
