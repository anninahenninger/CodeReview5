public class Product {
    private String name;
    private String quantity;
    private double oldPrice;
    private double newPrice;
    private String image;
    private String description;

    public Product(String name, String quantity, double oldPrice, double newPrice, String image, String description){
        this.name = name;
        this.quantity = quantity;
        this.oldPrice = oldPrice;
        this.newPrice = newPrice;
        this.image = image;
        this.description = description;
    }

    @Override
    public String toString() {
        return '{' + name + '\'' + ", old=" + oldPrice + ", new=" + newPrice + '}';
    }
    public String print(){
        String report = String.format("%S%n" + "%s%n" + "%s%n" + "instead " + "%.2f" + " €\n" + "Action price "
                        + "%.2f" + " €\n\n", name, quantity, description, oldPrice, newPrice);
        return report;
    }

    public String getName() {
        return name;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getOldPrice() {
        String oldPriceS = Double.toString(this.oldPrice);
        return oldPriceS;
    }

    public String getNewPrice() {
        String newPriceS = Double.toString(this.newPrice);
        return newPriceS;
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public void setOldPrice(String oldPrice) {
        this.oldPrice = Double.parseDouble(oldPrice);
    }

    public void setNewPrice(String newPrice) {
        this.newPrice = Double.parseDouble(newPrice);
    }
}
