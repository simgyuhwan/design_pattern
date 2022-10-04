package step1;

public class ModelDuck extends Duck {

    public ModelDuck(){
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다. ");
    }
}
