package model;

abstract class Product {

    private String productID;
    private String productName;
    private String productDescription;
    private double productPrice;
    private String productImage;
    private boolean isSelected = false;
    private double qty;

    public String getProductID() {
        return this.productID;
    }

    public void setProductID(String id) {
        this.productID = id;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String name) {
        this.productName = name;
    }

    public String getProductDescription() {
        return this.productDescription;
    }

    public void setProductDescription(String description) {
        this.productDescription = description;
    }

    public double getProductPrice() {
        return this.productPrice;
    }

    public void setProductPrice(double price) {
        this.productPrice = price;
    }

    public String getProductImage() {
        return this.productImage;
    }

    public void setProductImage(String path) {
        this.productImage = path;
    }

    public boolean getProductStatus() {
        return this.isSelected;
    }

    public void setProductStatus(boolean status) {
        this.isSelected = status;
    }

    public double getProductQuantity() {
        return this.qty;
    }

    public void setProductQuantity(double quantity) {
        this.qty = quantity;
    }
}
