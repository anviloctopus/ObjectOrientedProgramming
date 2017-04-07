//import com.theironyard.novauc.*;
import java.util.ArrayList;
/*
* Add an ArrayList that tracks all items of type `InventoryItem`.
        * Create at least five classes that extend the `InventoryItem` class, each one representing a product category.
        * Create a static `createItem` method in your main class which returns an object using the correct category class (or throws and error for an invalid category name).
        * `static InventoryItem createItem(String name, int quantity, String category)`
        * Each category class should have a constructor that sets the "category" field to the appropriate name.
        * Add one instance per class using the aforementioned `createItem` method
        * List each Inventory Item in the Array List
        * For each item, display the category
        * Use `String.format` or `System.out.printf` anywhere you are manually concatenating strings with `+`.
*/

// || means OR in a conditional statement
// && means ANF in conditional statements

public class Main {

    public static void main(String[] args) {

        // [0,1,2,3,4]

        ArrayList<InventoryItem> arrList = new ArrayList<>();
        // Belt
        arrList.add(Main.createItem("schumer", 2, "Belt"));

        // Shoe
        arrList.add(Main.createItem("matthews", 4, "Shoe"));
        // Pant
        arrList.add(Main.createItem("johnson", 6, "Pants"));
        // Sock
        arrList.add(Main.createItem("williams", 8, "Sock"));
        // Shirt
        arrList.add(Main.createItem("trujillo", 2, "Shirt"));


        for(int i = 0; i < 5; i++ ) {
            System.out.println(arrList.get(i));
        }
    }

    public static InventoryItem createItem(String name, int quantity, String category) {

        if(!category.equalsIgnoreCase("belt") || !category.equalsIgnoreCase("shoe") || !category.equalsIgnoreCase("pants")
                || !category.equalsIgnoreCase("sock") || !category.equalsIgnoreCase("shirt")) {

            throw new IllegalArgumentException("You entered an invalid category");

        }
        //shirt and pants
        InventoryItem item;
        if(category.equalsIgnoreCase("socks")) {
            Sock sockObj = new Sock(name, quantity);
            item = sockObj;
        } else if(category.equalsIgnoreCase("belt")) {
            Belt beltObj = new Belt(name,quantity);
            item = beltObj;
        } else if (category.equalsIgnoreCase("shoe")) {
            Shoe shoeObj = new Shoe(name, quantity);
            item = shoeObj;
        } else if(category.equalsIgnoreCase("pants")) {
            Pants pantsObj = new Pants(name, quantity);
            item = pantsObj;
        } else {
            Shirt shirtObj = new Shirt(name, quantity);
            item = shirtObj;
        }

        return item;
    }
}





