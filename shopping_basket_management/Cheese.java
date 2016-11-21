package shopping_basket_management;

public abstract class Cheese {

String type;
double price;

public Cheese(String type, double price) {
  this.type = type;
  this.price = price;
}

public String getType() {
  return this.type;
}

public double getPrice() {
  return this.price;
}


}