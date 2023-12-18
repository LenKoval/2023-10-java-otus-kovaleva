package homework;

import java.util.*;

public class CustomerService {
    private TreeMap<Customer, String> treeMap;

    public CustomerService() {
        this.treeMap = new TreeMap<>(Comparator.comparingLong(o -> o.getScores()));
    }

    public Map.Entry<Customer, String> getSmallest() {
        Map.Entry<Customer, String> map = treeMap.firstEntry();
        Customer cust = new Customer(map.getKey().getId(), map.getKey().getName(), map.getKey().getScores());
        return Map.entry(cust, map.getValue());
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        Map.Entry<Customer, String> map = treeMap.higherEntry(customer);
        if (Objects.isNull(map)) {
            return null;
        }
        Customer cust = new Customer(map.getKey().getId(), map.getKey().getName(), map.getKey().getScores());
        return Map.entry(cust, map.getValue());
    }

    public void add(Customer customer, String data) {
        treeMap.put(customer, data);
    }
}
