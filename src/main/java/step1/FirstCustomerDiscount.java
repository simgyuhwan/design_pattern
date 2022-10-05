package step1;

public class FirstCustomerDiscount implements DiscountPolicy{

    @Override
    public double calculateWithDisCountRate(Item item) {
        return item.getPrice() * 0.9;
    }
}
