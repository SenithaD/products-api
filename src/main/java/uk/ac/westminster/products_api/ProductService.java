package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    // Activity 10 - Add DigitalProduct and PhysicalProduct
    public ProductService() {

        addProduct(new DigitalProduct(
                null,
                "Java E-Book",
                1500.0,
                "https://example.com/book.pdf"
        ));

        addProduct(new PhysicalProduct(
                null,
                "Laptop",
                150000.0,
                2.5,
                "35x25x2 cm"
        ));
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product addProduct(Product product) {
        product.setId(nextId++);
        products.add(product);
        return product;
    }

    public Optional<Product> getProductById(Long id) {
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst();
    }

    // Activity 4 - Delete a product
    public void deleteProduct(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }

    // Activity 5 - Search products by name
    public List<Product> findByName(String name) {
        return products.stream()
                .filter(p -> p.getName().contains(name))
                .toList();
    }
}