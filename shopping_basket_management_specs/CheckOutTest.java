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
  customer1 = new Customer("Luke", false);
  checkOut = new CheckOut(customer1);
  // customer2 = new Customer("Pat", false);
  camembert = new Camembert("Camembert", 5.95);
  gouda = new Gouda("Gouda", 4.55);
  manchego = new Manchego("Manchego", 6.05);
  mozzarella = new Mozzarella("Mozzarella", 3.95);
}

@Test
public void canGetCustomerName() {
  assertEquals("Luke", checkOut.customer.getName());
}

@Test
public void canGetTotalCostOfBasket() {
  customer1.shoppingBasket.addCheese(gouda);
  assertEquals(4.55, checkOut.totalCost(),0.01);
}

@Test
public void canGetTotalCostOfBasketWithLoadsOfCheese() {
  customer1.shoppingBasket.addCheese(gouda);
  customer1.shoppingBasket.addCheese(camembert);
  customer1.shoppingBasket.addCheese(manchego);
  customer1.shoppingBasket.addCheese(mozzarella);
  customer1.shoppingBasket.addCheese(gouda);
  assertEquals(25.05, checkOut.totalCost(),0.01);
}









}