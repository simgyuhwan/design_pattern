package step1;

public class LastCustomerDiscount implements DiscountPolicy{

    @Override
    public double calculateWithDisCountRate(Item item) {
        return item.getPrice() * 0.8;
    }
}
