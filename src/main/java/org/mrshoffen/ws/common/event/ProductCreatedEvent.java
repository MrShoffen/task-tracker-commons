package org.mrshoffen.ws.common.event;

public class ProductCreatedEvent {


    private String title;
    private String price;
    private Integer quantity;
    private String productId;

    public ProductCreatedEvent() {
    }

    public ProductCreatedEvent(String title, String price, Integer quantity, String productId) {
        this.title = title;
        this.price = price;
        this.quantity = quantity;
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }



}
