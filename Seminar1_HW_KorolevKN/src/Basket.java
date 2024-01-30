public class Basket{
    private String name;
    private Product[] products;
    private int count;


    public Basket(String name, Product[] products) {
        this.name = name;
        this.products = products;
        this.count = 0;
    }
    public void addToBasket(int amount, String productName) {
        for (Product product : products) {
            if (product.getNameProduct().equals(productName)) {
                //product.deleteFromProduct(amount, productName);
                count += amount;
                System.out.printf("С прилавка удалено %d единицы товара %s.%n", amount, productName);
                System.out.printf("Добавлено %d единицы товара %s в корзину.%n", count, productName);
                return;
            }
        }
        System.out.println("Такого продукта нет на прилавках.");
    }


    public String getName() {
        return name;
    }
    public int getCount() {
        return count;
    }
    public void getProducts() {
        System.out.println("В тележке " + getCount() + " товара");
        System.out.println("Среди них:");
        for (Product product : products) {
            System.out.printf("%s: %d шт.%n", product.getNameProduct(), getCount());
        }
    }
}
