package homework;

import java.util.*;

public class CustomerService {
    private final TreeMap<Customer, String> treeMap;

    public CustomerService() {
        this.treeMap = new TreeMap<>(Comparator.comparingLong(o -> o.getScores()));
    }

    public Map.Entry<Customer, String> getSmallest() {
        Map.Entry<Customer, String> entry = treeMap.firstEntry();
        if (Objects.isNull(entry)) {
            return null;
        }
        Customer customer = new Customer(entry.getKey().getId(), entry.getKey().getName(), entry.getKey().getScores());
        return Map.entry(customer, entry.getValue());
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        Map.Entry<Customer, String> entry = treeMap.higherEntry(customer);
        if (Objects.isNull(entry)) {
            return null;
        }
        Customer cust = new Customer(entry.getKey().getId(), entry.getKey().getName(), entry.getKey().getScores());
        return Map.entry(cust, entry.getValue());
    }

    public void add(Customer customer, String data) {
        treeMap.put(customer, data);
    }
}
