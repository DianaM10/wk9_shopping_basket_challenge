package shopping_basket_management;
import java.util.ArrayList;

public class ShoppingBasket {

  ArrayList<Cheese> basket;

  public ShoppingBasket() {
    this.basket = new ArrayList<Cheese>();

  }

  // public HashMap getBasket() {
  //   return this.basket;
  // }

  public void addCheese(Cheese cheese) {
    this.basket.add(cheese);
  }

  public int basketCount() {
    return this.basket.size();
  }

  public void removeItem(Cheese cheese) {
    this.basket.remove(cheese);
  }

  public void emptyBasket() {
    this.basket.clear();
  }
}
