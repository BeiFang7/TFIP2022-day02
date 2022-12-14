//if in the same package dont need to import
package cart;

public class Apple extends Item{

  private String type;

  //follows the parent constructor
  public Apple (){
    //super is calling Item Class (parent)
    super("Apple","c-apple");
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}

  