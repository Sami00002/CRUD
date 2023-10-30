package org.example;

public class Main {
    public static void main(String[] args) {

        // Create a basic product repository
        Repository<Product> productRepository = new ProductRepository();

        Repository<Product> loggedProductRepository = new LoggingDecorator<>(productRepository);

        Product newProduct = new Product(1, "New Product");
        loggedProductRepository.add(newProduct);

        Product retrievedProduct = loggedProductRepository.get(1);
        System.out.println("Retrieved product: " + retrievedProduct.getName());

        loggedProductRepository.update(new Product(1, "Updated Product"));

        loggedProductRepository.delete(1);
    }
}