package shopping_basket_management;
import java.util.ArrayList;

public class CheckOut {

Customer customer;

public CheckOut(Customer customer) {
  this.customer = customer;
}

public double totalCost() {
  double total = 0;
  ArrayList toBuy = this.customer.shoppingBasket.basket;
  for (Cheese cheese : toBuy) {
   total += cheese.getPrice();
  }
  return total;
}

}