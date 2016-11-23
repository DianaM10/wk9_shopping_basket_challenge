import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket_management.*;

public class CustomerTest {

Customer customer1;
Customer customer2;
Camembert camembert;
Gouda gouda;
Manchego manchego;
Mozzarella mozzarella;


@Before
public void before() {
  customer1 = new Customer("Luke", false);
  customer2 = new Customer("Pat", false);
  camembert = new Camembert("Camembert", 5.95, false);
  gouda = new Gouda("Gouda", 4.55, true);
  manchego = new Manchego("Manchego", 6.05, false);
}

@Test
public void canGetName() {
  assertEquals("Luke", customer1.getName());
}

@Test
public void canCheckHasLoyaltyCard() {
  assertEquals( false, customer2.getLoyaltyCard());
}

@Test
public void canGiveCustomerLoyaltyCard() {
  customer1.setLoyaltyCard(true);
  assertEquals( true, customer1.getLoyaltyCard());
}

@Test
public void canCustomer1BuyCheese() {
customer1.shoppingBasket.addCheese(manchego);
assertEquals(1, customer1.shoppingBasket.basketCount());
}

@Test
public void canCustomer1Buy3Cheeses() {
customer1.shoppingBasket.addCheese(camembert);
customer1.shoppingBasket.addCheese(camembert);
customer1.shoppingBasket.addCheese(camembert);
assertEquals(3, customer1.shoppingBasket.basketCount());
}














}