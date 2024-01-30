public class Product {
    protected int count;
    private String name;
    private double price;
    private int rating; //целочисленный рейтинг от 1 до 10
    public Product(String name, double price, int rating, int count) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.count = count;
    }
    public void deleteFromProduct(int amount, String productName){
        this.count -= amount;
        //System.out.printf("С прилавка удалено %d единицы товара %s.%n", amount, productName);
    }
    public int getCount() {
        return count;
    }
    public String getNameProduct() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getRating() {
        return rating;
    }
}