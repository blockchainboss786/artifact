package junitlearning3_4Test;

import java.util.HashMap;
import java.util.Map;

public class InventoryService {
	private Map<String, Integer> stock = new HashMap<>();

    public InventoryService() {
        stock.put("laptop", 5);
        stock.put("phone", 10);
    }

    public boolean isInStock(String product) {
        return stock.getOrDefault(product, 0) > 0;
    }

    public void reduceStock(String product) {
        if (!isInStock(product)) {
            throw new RuntimeException("Out of stock for: " + product);
        }
        stock.put(product, stock.get(product) - 1);
    }

}
