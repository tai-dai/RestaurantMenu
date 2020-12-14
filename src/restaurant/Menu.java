package restaurant;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    public static LocalDate lastUpdated;

    public static ArrayList <MenuItem> menuItems = new ArrayList<>();

    //methods
    public static void addItem(MenuItem menuItem){
        //THIS WORKS!!!
        if (!menuItems.contains(menuItem)) {
            menuItems.add(menuItem);
        } else {
            System.out.println("That's already on the menu!");
        }
    }

    public static void removeItem(MenuItem menuItem){
        if (menuItems.contains(menuItem)){
            menuItems.remove(menuItem);
        }
    }

    public static void getLastUpdated() {
        //THIS WORKS!!!
        int lastIndex = menuItems.size() - 1;
        LocalDate newestItemDate = menuItems.get(lastIndex).getDateAdded();
        lastUpdated = newestItemDate;
        System.out.println("~Menu last updated on " + lastUpdated);
    }

    public static void isNew(MenuItem menuItem){
        //This don't work
        LocalDate addedDate = menuItem.getDateAdded();
        LocalDate whenOld = LocalDate.now().minusWeeks(1);
        if (whenOld.isAfter(addedDate)){
            menuItem.setNew(false);
        }
    }

    public static void printMenu(){
        //THIS WORKS!!!
        for (MenuItem menuItem : menuItems){
            String newMessage = "";
            Menu.isNew(menuItem);
            if (menuItem.getNew().equals(true)){
                newMessage = "NEW!!!";
            }
            System.out.println("***************\n" + newMessage + "\n" + menuItem.getName() + "\n$" + menuItem.getPrice() + " // " + menuItem.getCategory() + "\n" + menuItem.getDescription() + "\n***************");
        }
    }

    public void printItem(String searchItem){
        ////
    }

    // methods to add:
    // add items CHECK!
    // remove items CHECK!
    // is new CHECK!
    // last updated CHECK!
    // print entire menu or single item
    // two items equal CHECK!


}
