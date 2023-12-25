package homework;

import java.util.ArrayDeque;

public class CustomerReverseOrder {
    private final ArrayDeque<Customer> deque = new ArrayDeque<>();

    public void add(Customer customer) {
        deque.push(customer);
    }

    public Customer take() {
        return deque.pop();
    }
}
