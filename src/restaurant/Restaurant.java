package restaurant;

import java.time.LocalDate;

public class Restaurant {
    public static void main(String[] args){

        MenuItem matcha = new MenuItem("Matcha Bubble Tea", 5.000,"Green tea with boba pearls", "Dessert", LocalDate.of(2002, 10, 10)){};
        MenuItem udon = new MenuItem("Mushroom Udon", 9.50, "Mushrooms, noodles, and egg in a miso broth", "Entree", LocalDate.of(2020, 12,12)){};

        Menu.addItem(matcha);
        Menu.addItem(udon);

        Menu.printMenu();
        Menu.getLastUpdated();
    }
}

