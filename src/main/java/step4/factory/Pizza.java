package step4.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;

    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    abstract void prepare();
    List<String> toppings = new ArrayList<>();

    void box() {
        System.out.println("상자에 담기");
    }

    void cut() {
        System.out.println("8등분 하기");
    }

    void bake() {
        System.out.println("175도에서 25분 간 굽기");
    }

    public String getName(){
        return name;
    }
}
