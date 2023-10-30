package org.example;
class ProductRepository implements Repository<Product> {
    @Override
    public void add(Product item) {
        System.out.println("Added product: " + item.getName());
    }

    @Override
    public Product get(int id) {
        System.out.println("Read product with id: " + id);
        return new Product(id, "Sample Product");
    }

    @Override
    public void update(Product item) {
        System.out.println("Updated product with id: " + item.getId());
    }

    @Override
    public void delete(int id) {
        System.out.println("Deleted product with id: " + id);
    }
}