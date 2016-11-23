import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket_management.*;

public class CamembertTest {

Camembert camembert;

@Before
public void before() {
  camembert = new Camembert("Camembert", 5.95, false);
}

@Test
public void hasType(){
  assertEquals("Camembert", camembert.getType());
}

@Test
public void hasPrice() {
  assertEquals(5.95, camembert.getPrice(), 0.01);
}

}