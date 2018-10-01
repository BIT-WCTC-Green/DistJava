package us.matt.model;

public class Item {
    private int productNumer;
    private String name;
    private double price;
    private boolean featured;
    private String description;
    private String image;

    public Item(int productNumer, String name, double price, boolean featured, String description, String image) {
        this.productNumer = productNumer;
        this.name = name;
        this.price = price;
        this.featured = featured;
        this.description = description;
        this.image = image;
    }

    public int getProductNumer() {
        return productNumer;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isFeatured() {
        return featured;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }
}
