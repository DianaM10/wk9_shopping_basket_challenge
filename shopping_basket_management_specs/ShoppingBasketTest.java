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
  camembert = new Camembert("Camembert", 5.95);
  gouda = new Gouda("Gouda", 4.55);
  manchego = new Manchego("Manchego", 6.05);

}

@Test
public void canAddCamembertToBasket() {
  shoppingbasket.addCheese(camembert);
  assertEquals(1, shoppingbasket.basketCount());
}

@Test
public void canAdd3CheesesToBasket() {
  shoppingbasket.addCheese(camembert);
  shoppingbasket.addCheese(gouda);
  shoppingbasket.addCheese(manchego);
  assertEquals(3, shoppingbasket.basketCount());
}

@Test
public void canRemoveCheeseFromBasket() {
  shoppingbasket.addCheese(camembert);
  shoppingbasket.addCheese(gouda);
  shoppingbasket.addCheese(manchego);
  shoppingbasket.removeItem(gouda);
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


}