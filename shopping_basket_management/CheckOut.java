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
  if (this.customer.getLoyaltyCard() == false && total >= 20) {
    return (total * 0.9);
  }
  if (this.customer.getLoyaltyCard() == true && total <= 20) {
    return (total * 0.98);
  }
  if (this.customer.getLoyaltyCard() == true && total >= 20) {
    return (total * 0.98)*0.9;
  }
  
  else return total;
}

// public bogofDiscount() {
//   ArrayList bogofs = new ArrayList<BOGOFable>();
//   ArrayList toBuy = this.customer.shoppingBasket.basket;
//   for (Object object : toBuy) {
//     Cheese cheese = ((Cheese) object);
//     if (cheese instanceof BOGOFable) {
//       bogofs.add(cheese);
//     }
//       // for (BOGOFable item : bogofs) {
//     ArrayList duplicate = new ArrayList<cheese>();
//         for (Cheese cheese : bogofs ) {
          

//           }
//         }

//           }

//         }
//       }






// public double checkForLoyaltyDiscount() {
//   double total = this.totalCost();
//   if (this.customer.getLoyaltyCard() == true && total <= 20) {
//   return (total * 0.98);
//   }
//   if (this.customer.getLoyaltyCard() == true && total >= 20) {
//   return (total * 0.98)*0.9;
//   }
//   else return total;
//   }



}