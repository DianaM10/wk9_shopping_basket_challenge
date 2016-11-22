package shopping_basket_management;
import java.util.ArrayList;

public class Customer {

  String name;
  Boolean loyaltyCard;
  ShoppingBasket shoppingBasket;


  public Customer(String name, Boolean loyaltyCard) {
    this.name = name;
    this.loyaltyCard = loyaltyCard;
    this.shoppingBasket = new ShoppingBasket();
  }

  public String getName() {
    return(name);
  }

  public Boolean getloyaltyCard() {
    return(loyaltyCard);
  }

  public void setloyaltyCard() {
    this.loyaltyCard = true;

  }





}