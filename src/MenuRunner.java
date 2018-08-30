import java.util.ArrayList;

public class MenuRunner {


    public static void main(String[] args) {
        Dish dish1 = new Dish("soup", "mushrom soup", 20.35);
        Dish dish2 = new Dish("soup", "shrimp soup", 75.75);
        Dish dish3 = new Dish("cold cuts", "venison, wild boar, ostrich", 222.22);
        Dish dish4 = new Dish("garnish", "rice", 17.5);
        Dish beverage1 = new Dish("juice", "apple juice", 7.0);
        Dish beverage2 = new Dish("tea", "green tea", 5.5);


        Menu menu1 = new Menu("VIP lunch");
        Menu menu2 = new Menu("Lunch");

        menu1.addDish(dish2);
        menu1.addDish(dish3);
        menu1.addDish(beverage1);

        menu2.addDish(dish1);
        menu2.addDish(dish4);
        menu2.addDish(beverage2);

        System.out.println("The cheapest dish of " + menu1.getName() + " is " + menu1.getCheapestDishes().getName());
        System.out.println("The cheapest dish of " + menu2.getName() + " is " + menu2.getCheapestDishes().getName());
    }
}
