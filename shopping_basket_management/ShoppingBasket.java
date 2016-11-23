package shopping_basket_management;
import java.util.ArrayList;

public class ShoppingBasket {

  ArrayList<Cheese> basket;

  public ShoppingBasket() {
    this.basket = new ArrayList<Cheese>();

  }

  public void addCheese(Camembert camembert) {
    if (camembert.getBogof() == true) {
      Camembert bogofcheese = new Camembert(camembert.getType());
      this.basket.add(bogofcheese);
    }
    this.basket.add(camembert);
  }

  public void addCheese(Gouda gouda) {
    if (gouda.getBogof() == true) {
      Gouda bogofcheese = new Gouda(gouda.getType());
      this.basket.add(bogofcheese);
    }
    this.basket.add(gouda);
  }

  public void addCheese(Manchego manchego) {
    if (manchego.getBogof() == true) {
      Manchego bogofcheese = new Manchego(manchego.getType());
      this.basket.add(bogofcheese);
    }
    this.basket.add(manchego);
  }
  public void addCheese(Mozzarella mozzarella) {
    if (mozzarella.getBogof() == true) {
      Mozzarella bogofcheese = new Mozzarella(mozzarella.getType());
      this.basket.add(bogofcheese);
    }
    this.basket.add(mozzarella);
  }

  public int basketCount() {
    return this.basket.size();
  }

  public void removeItem(Cheese cheese) {
    if (cheese.getBogof() == true) {
      for (Cheese item: basket) {
        if (item.getPrice() == 0 && item.getType() == cheese.getType()) {
        }
        basket.remove(item);
        basket.remove(cheese);
      }
    }
    this.basket.remove(cheese);
  }

  public void emptyBasket() {
    this.basket.clear();
  }
}
