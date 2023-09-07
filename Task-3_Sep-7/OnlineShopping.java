/*  Task 10: Online Shopping System
    Design a simple online shopping system. Create classes like Product, Cart, and Customer. 
    Implement methods to add products to the cart, calculate the total, and simulate a purchase. */

import java.util.List;
import java.util.ArrayList;

// Product class
class Product{

    private String name;
    private double price;

    public Product(String name, double price){

        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }
}

// Cart class
class Cart{

    private Customer customer;
    private List<Product> products;

    public Cart(Customer customer){

        this.customer = customer;
        this.products = new ArrayList<>(); // Initialize ArrayList
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public double calculateTotal(){

        double total = 0.0;
        for(Product product : products){
            total += product.getPrice();
        }
        return total;
    }

    public void checkout(){

        double total = calculateTotal();
        System.out.println("Thank you, " + customer.getName() + "!");
        System.out.println("Your total purchase amount is: Rs." + total);
        // Simulate payment process, order confirmation, etc.
        products.clear(); // Clear the cart after purchase
    }
}

// Customer class
class Customer{

    private String name;

    public Customer(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

public class OnlineShopping{

    public static void main(String[] args){

        // Create products
        Product laptop = new Product("Laptop", 60000.0);
        Product smartphone = new Product("Smartphone", 30000.0);
        Product headphones = new Product("Headphones", 600.0);

        // Create a customer
        Customer customer = new Customer("Suraj Sharma");

        // Create a cart for the customer
        Cart cart = new Cart(customer);

        // Add products to the cart
        cart.addProduct(laptop);
        cart.addProduct(smartphone);
        cart.addProduct(headphones);

        // Calculate and display the total
        double total = cart.calculateTotal();
        System.out.println("Total cart value: Rs." + total);

        // Checkout and simulate a purchase
        cart.checkout();
    }
}
