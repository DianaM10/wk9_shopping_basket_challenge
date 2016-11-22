import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket_management.*;

public class CheckOutTest {

CheckOut checkOut;
Customer customer1;
Camembert camembert;
Gouda gouda;
Manchego manchego;
Mozzarella mozzarella;


@Before
public void before() {
  checkOut = new CheckOut(customer1);
  customer1 = new Customer("Luke", false);
  // customer2 = new Customer("Pat", false);
  camembert = new Camembert("Camembert", 5.95);
  gouda = new Gouda("Gouda", 4.55);
  manchego = new Manchego("Manchego", 6.05);
}

@Test
public void canGetTotalCostOfBasket() {
  customer1.shoppingBasket.addCheese(gouda);
  assertEquals(4.55, checkOut.totalCost());
}
}