import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket_management.*;

public class ShoppingBasketTest {

ShoppingBasket shoppingbasket;
Camembert camembert;
Gouda gouda;
Manchego manchego;
Mozzarella mozzarella;

@Before
public void before() {
  shoppingbasket = new ShoppingBasket();
  camembert = new Camembert("Camembert", 5.95, false);
  gouda = new Gouda("Gouda", 4.55, true);
  manchego = new Manchego("Manchego", 6.05, false);
  mozzarella = new Mozzarella("Mozzarella", 3.95, false);

}

@Test
public void canAddCamembertToBasket() {
  shoppingbasket.addCheese(gouda);
  assertEquals(2, shoppingbasket.basketCount());
}

@Test
public void canAdd3CheesesToBasketIncludingBogof() {
  shoppingbasket.addCheese(camembert);
  shoppingbasket.addCheese(gouda);
  shoppingbasket.addCheese(manchego);
  assertEquals(4, shoppingbasket.basketCount());
}

@Test
public void canRemoveCheeseFromBasket() {
  shoppingbasket.addCheese(camembert);
  shoppingbasket.addCheese(mozzarella);
  shoppingbasket.addCheese(manchego);
  shoppingbasket.removeItem(manchego);
  assertEquals(2, shoppingbasket.basketCount());
}

@Test
public void canClearBasket() {
  shoppingbasket.addCheese(camembert);
  shoppingbasket.addCheese(gouda);
  shoppingbasket.addCheese(manchego);
  shoppingbasket.emptyBasket();
  assertEquals(0, shoppingbasket.basketCount());
}

@Test
public void canRemoveCheeseAndBogofCheese() {
  shoppingbasket.addCheese(gouda);
  shoppingbasket.addCheese(camembert);
  assertEquals(3, shoppingbasket.basketCount());
  shoppingbasket.removeItem(gouda);
  assertEquals(1, shoppingbasket.basketCount());
}














}