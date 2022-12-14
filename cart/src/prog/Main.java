package prog;

import cart.Apple;
import cart.Item;
import cart.Orange;

public class Main {

  public static void main(String[] args){
    // Item apple = new Item("Apple", "c-apple");
    // Item orange = new Item("Orange", "c-orange");

    // apple.setPrice(0.5f);
    // apple.setQuantity(10);

    // orange.setPrice(0.5f);
    // orange.setQuantity(10);

    Apple apple = new Apple();
    apple.setType("washington");

    Item orange = new Orange();

    System.out.printf("apple code is %s\n",apple.getCode());
    System.out.printf("orange code is %s\n",orange.getCode());
    
    Item item = apple;
    System.out.printf("itemcode: %s\n", item.getCode());

    Apple washington = (Apple)item;
    System.out.printf("washington code: %s\n", washington.getCode());

    System.out.printf("is item an Orange? %b\n", item instanceof Orange);
    if (item instanceof Orange)
      orange = (Orange)item;

  
  }
  
}


