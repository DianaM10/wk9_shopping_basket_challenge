package shopping_basket_management;

public abstract class Cheese {

String type;
double price;
Boolean bogof;

public Cheese(String type, double price, Boolean bogof) {
  this.type = type;
  this.price = price;
  this.bogof = bogof;
}

public Cheese(String type) {
this.type = type;
this.price = 0;
}

public String getType() {
  return this.type;
}

public double getPrice() {
  return this.price;
}

public Boolean getBogof() {
  return this.bogof;
}

public void setPrice(double price) {
  this.price = price;
}

public void setBoolean(Boolean bogof) {
  this.bogof = bogof;
}


}