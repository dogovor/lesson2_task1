import java.util.ArrayList;

public class Menu {
    public final String name;
    private final ArrayList<Dish> dishes = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", dishes=" + dishes +
                '}';
    }

    public Dish getCheapestDishes() {
        Dish s = dishes.get(0);
        for (Dish i : dishes) {
            if (i.getPrice() < s.getPrice())
                s = i;
        }
        return s;
    }
}






