package model;

public class Product {
    

    private String productID;
    private String productName;
    private String productDescription;
    private String productPrice;
    private String productImage;

    public String getProductID(){
        return this.productID;
    }

    public void setProductID(String id){
        this.productID = id;
    }

    public String getProductName(){
        return this.productName;
    }

    public void setProductName(String name){
        this.productName = name;
    }

    public String getProductDescription(){
        return this.productDescription;
    }

    public void setProductDescription(String description){
        this.productDescription = description;
    }

    public String getProductPrice(){
        return this.productPrice;
    }

    public void setProductPrice(String price){
        this.productPrice = price;
    }

    public String getProductImage(){
        return this.productImage;
    }

    public void setProductImage(String path){
        this.productImage = path;
    }
}
