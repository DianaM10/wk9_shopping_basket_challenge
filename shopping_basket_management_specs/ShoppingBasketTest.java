import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket_management.*;

public class ShoppingBasketTest {

ShoppingBasket basket;
Camembert camembert;
Gouda gouda;
Manchego manchego;
Mozzarella mozzarella;

@Before
public void before() {
  basket = new ShoppingBasket();
  camembert = new Camembert("Camembert", 5.95);
  gouda = new Gouda("Gouda", 4.55);
  manchego = new Manchego("Manchego", 6.05);

}

@Test
public void canAddCamembertToBasket() {
  asserEquals("Camembert" 5.95, basket.addCheese(camembert);
}


}