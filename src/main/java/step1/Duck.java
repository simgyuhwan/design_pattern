package step1;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){}

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("oh.");
    }

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }
}
