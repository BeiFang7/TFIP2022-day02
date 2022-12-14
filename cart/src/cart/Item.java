package cart;

public class Item{

  //members
  private String name = "";
  private String code = "";
  //Need to initialise because we are using class, need to instantiate by initialising. Need to put in f for float because 0 is integer not float, it will show error without f. 
  private Float price = 0f;
  //Similarly for Integer (class), need to instantiate by initailising to zero.
  private Integer quantity = 0;

  //Cannot create an item without having name and code
  public Item(String name,String code){
    this.name = name;
    this.code = code;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }
  public Float getPrice() {
    return price;
  }
  public void setPrice(Float price) {
    this.price = price;
  }
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  //Calculate total Price = price x quantity and gives a float value
  public Float totalPrice (){
    return this.price * this.quantity;
  }

}