package shopping_basket_management;
import java.util.ArrayList;

public class Customer {

  String name;
  Boolean loyaltyCard;
  public ShoppingBasket shoppingBasket;


  public Customer(String name, Boolean loyaltyCard) {
    this.name = name;
    this.loyaltyCard = loyaltyCard;
    this.shoppingBasket = new ShoppingBasket();
  }

  public String getName() {
    return(name);
  }

  public Boolean getLoyaltyCard() {
    return(loyaltyCard);
  }

  public void setLoyaltyCard(Boolean loyaltyCard) {
    this.loyaltyCard = loyaltyCard;

  }





}