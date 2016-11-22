package shopping_basket_management;
import java.util.ArrayList;

public class CheckOut {

public Customer customer;

public CheckOut(Customer customer) {
  this.customer = customer;
}

public double totalCost() {
  double total = 0;
  ArrayList toBuy = this.customer.shoppingBasket.basket;
  for (Object object : toBuy) {
    Cheese cheese = ((Cheese) object);
   total += cheese.getPrice();
  }
  return total;
}

}