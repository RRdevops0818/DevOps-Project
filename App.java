package com.foodapp.service;

import com.foodapp.model.Restaurant;
import com.foodapp.model.Order;

import java.util.*;

public class FoodService {

    private List<Restaurant> restaurants = new ArrayList<>();

    public FoodService() {
        restaurants.add(new Restaurant("RR Spices",
                Arrays.asList("Biryani", "Fried Rice", "Chicken Curry")));

        restaurants.add(new Restaurant("Zomato",
                Arrays.asList("Pasta", "Sandwich", "Salad")));
    }

    public void showRestaurants() {
        for (Restaurant r : restaurants) {
            System.out.println("Restaurant: " + r.getName());
            System.out.println("Menu: " + r.getMenu());
        }
    }
    <packaging>war</packaging>

    public void placeOrder(String item, String restaurantName) {
        Order order = new Order(item, restaurantName);
        order.confirmOrder();
    }
}
<build>
    <plugins>
        <plugin>
            <artifactId>maven-war-plugin</artifactId>
            <version>3.4.0</version>
        </plugin>

        <plugin>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.11.0</version>
            <configuration>
                <source>17</source>
                <target>17</target>
            </configuration>
        </plugin>
    </plugins>
</build>
