package Week8.ex12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    private Map<String, Integer> stocks;
    private Map<String, Integer> prices;
    private Map<String, Integer> products;

    public Storehouse() {
        stocks = new HashMap<String, Integer>();
        prices = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock){
        stocks.put(product, stock);
        prices.put(product, price);

    }

    public void decreaseStock(String product) {
        if (stocks.containsKey(product) && stocks.get(product) > 0) {
            int currentStock = stocks.get(product);
            stocks.put(product, currentStock - 1);
        }
    }

    public int price(String product){
        if(stocks.containsKey(product)){
            return prices.get(product);
        } else {
            return -99;
        }
    }
// 12.2  Product Stock
    public int stock(String product){
        if(stocks.containsKey(product)){
            return  stocks.get(product);
        }
        return 0;
    }

    public boolean take(String product){
        if(stocks.containsKey(product)){
            if(stocks.get(product) - 1 < 0){
                return false;
            }
            stocks.put(product, stocks.get(product) - 1);
            return true;
        }
        return false;
    }

    // 12.3 Listing The Products

    public Set<String> products(){
        return stocks.keySet();
    }



}
