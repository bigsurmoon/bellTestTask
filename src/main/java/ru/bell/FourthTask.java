package ru.bell;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FourthTask {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        // Добавление товаров
        shoppingCart.addProduct("Товар 1", 2);
        shoppingCart.addProduct("Товар 2", 3);
        shoppingCart.addProduct("Товар 3", 1);

        // Получение списка товаров
        List<String> products = shoppingCart.getProducts();
        System.out.println("Товары в корзине: ");
        for (String product : products) {
            System.out.println(product);
        }

        // Получение количества определенного товара
        String product = "Товар 2";
        int quantity = shoppingCart.getProductQuantity(product);
        System.out.println("Количество товара \"" + product + "\": " + quantity);

        // Обновление количества товара
        shoppingCart.updateProductQuantity("Товар 1", 5);

        // Удаление товара
        shoppingCart.removeProduct("Товар 3");

        // Очистка корзины
        shoppingCart.clear();

    }

    interface Basket {
        void addProduct(String product, int quantity);

        void removeProduct(String product);

        void updateProductQuantity(String product, int quantity);

        void clear();

        List<String> getProducts();

        int getProductQuantity(String product);
    }

    static class ShoppingCart implements Basket {
        private Map<String, Integer> products;

        public ShoppingCart() {
            this.products = new HashMap<>();
        }

        @Override
        public void addProduct(String product, int quantity) {
            if (quantity <= 0) {
                throw new IllegalArgumentException("Quantity must be positive");
            }
            int newQuantity = products.getOrDefault(product, 0) + quantity;
            products.put(product, newQuantity);
        }

        @Override
        public void removeProduct(String product) {
            products.remove(product);
        }

        @Override
        public void updateProductQuantity(String product, int quantity) {
            if (quantity <= 0) {
                throw new IllegalArgumentException("Quantity must be positive");
            }
            products.put(product, quantity);
        }

        @Override
        public void clear() {
            products.clear();
        }

        @Override
        public List<String> getProducts() {
            return new ArrayList<>(products.keySet());
        }

        @Override
        public int getProductQuantity(String product) {
            return products.getOrDefault(product, 0);
        }
    }
}