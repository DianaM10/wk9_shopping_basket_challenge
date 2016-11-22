import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket_management.*;

public class CustomerTest {

Customer customer1;
Customer customer2;

@Before
public void before() {
  customer1 = new Customer("Luke", false);
  customer2 = new Customer("Pat", false);
}

@Test
public void canGetName() {
  assertEquals("Luke", customer1.getName());
}
}