package az.edu.ada.wm2.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class Product {

    private UUID id;
    private String productName;
    private BigDecimal price;
    private LocalDate expirationDate;

    // No-args constructor (id auto-generated)
    public Product() {
        this.id = UUID.randomUUID();
    }

    // Constructor without id (id auto-generated)
    public Product(String productName, BigDecimal price, LocalDate expirationDate) {
        this.id = UUID.randomUUID();
        this.productName = productName;
        this.price = price;
        this.expirationDate = expirationDate;
    }

    // Constructor with all fields (useful for update). If id is null, generate it.
    public Product(UUID id, String productName, BigDecimal price, LocalDate expirationDate) {
        this.id = (id == null) ? UUID.randomUUID() : id;
        this.productName = productName;
        this.price = price;
        this.expirationDate = expirationDate;
    }

    public UUID getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
}