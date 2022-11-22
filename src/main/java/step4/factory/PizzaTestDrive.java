package step4.factory;

public class PizzaTestDrive {

    public static void main(String[] args) {
        NYPizzaStore nyStore = new NYPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("에딘이 주문한 " + pizza.getName());
    }
}
