package Week8.ex12;

import java.util.HashMap;
import java.util.Map;


public class ShoppingBasket {
    private Map<String, Purchase> purchases;

    public ShoppingBasket(){
        this.purchases = new HashMap<>();
    }

    public void add(String product, int price) {

        if (purchases.containsKey(product)) {
            Purchase existingPurchase  = purchases.get(product);
            existingPurchase.increaseAmount();
        } else {
            Purchase purchase = new Purchase(product, 1, price);
            purchases.put(product, purchase);
        }
    }

    public int price(){
        int total = 0;
        for(Purchase purchase : purchases.values()){
            total += purchase.price();
        }
        return total;
    }

    public void print(){
        for(Purchase purchase : purchases.values()){
            System.out.println(purchase);
        }
    }
}
