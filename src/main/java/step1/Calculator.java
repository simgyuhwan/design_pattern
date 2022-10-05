package step1;

import java.util.List;

public class Calculator {
    private final DiscountPolicy discountPolicy;

    public Calculator(DiscountPolicy discountPolicy){
        this.discountPolicy = discountPolicy;
    }

    public double calculate(boolean isFirstGuest, boolean isLastGuest, List<Item> items){
        double sum = 0;
        for (Item item : items) {
            if(isFirstGuest){
                sum += item.getPrice() * 0.9;
            }else if(!item.isFresh()){
                sum += item.getPrice() * 0.8;
            }else if(isLastGuest){
                sum += item.getPrice() * 0.8;
            }else {
                sum += item.getPrice();
            }
        }
        return sum;
    }

    public double calculate(List<Item> items){
        double sum = 0;
        for (Item item : items) {
            sum += discountPolicy.calculateWithDisCountRate(item);
        }
        return sum;
    }

}

class Item{
    private final String name;
    private final int price;

    public Item(String name, int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }
    public boolean isFresh(){
        return true;
    }
}
