package shopping_basket_management;
import java.util.HashMap;

public class ShoppingBasket {

  HashMap< String, Double > basket;

  public ShoppingBasket() {
    basket = new HashMap< String, Double >();

  }

  public void addCheese(Cheese cheese) {
    this.basket.put(cheese.getType, cheese.getPrice);
  }
  


}