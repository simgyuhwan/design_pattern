package step1;

public class ExecuteClass {
    public static void main(String[] args) {
       Duck mallard = new MallardDuck();
       mallard.performQuack();
       mallard.performFly();

       Duck duck = new ModelDuck();
       duck.performFly();
       duck.setFlyBehavior(new FlyRocketPowered());
       duck.performFly();
    }
}
