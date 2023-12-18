package ru.mirea.task4.num3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class User {
    private String username;
    private String password;
    private Map<Catalog, List<Product>> cart;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.cart = new HashMap<>();
    }

    public String getUsername() {
        return username;
    }

    public boolean authenticate(String password) {
        return this.password.equals(password);
    }

    public void addToCart(Catalog catalog, Product product) {
        cart.computeIfAbsent(catalog, k -> new ArrayList<>()).add(product);
    }

    public double checkout() {
        double total = 0;
        for (List<Product> products : cart.values()) {
            for (Product product : products) {
                total += product.getPrice();
            }
        }
        cart.clear();
        return total;
    }
}