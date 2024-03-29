package id.ac.ui.cs.advprog.eshop.repository;

import id.ac.ui.cs.advprog.eshop.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class ProductRepository {
    private List<Product> productData = new ArrayList<>();

    public Product create(Product product) {
        productData.add(product);
        return product;
    }

    public Product edit(Product product, Product newProduct) {
        product.edit(newProduct);
        return product;
    }

    public Iterator<Product> findAll() {
        return productData.iterator();
    }

    public Product findProductById(String id) {
        Product thisProduct = null;
        for (Product product : productData) {
            if (product.getProductId().equals(id)) {
                thisProduct = product;
            }
        }
        return thisProduct;
    }

    public void deleteProduct(String id) {
        Product product = findProductById(id);
        productData.remove(product);
    }
    
}
