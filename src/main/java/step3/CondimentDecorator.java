package step3;

public class CondimentDecorator extends Beverage{
    Beverage beverage;

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public double cost() {
        return 0;
    }
}
