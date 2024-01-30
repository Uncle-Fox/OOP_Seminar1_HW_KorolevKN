public class Category {


    private String name;
    private Product[] products;

    public Category(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    public void getAllCategory(){
        System.out.println("В магазине продуктов вида " + getName() + " осталсось: ");
        for (Product product : products) {
            System.out.printf("%s: %d шт.%n", product.getNameProduct(), product.getCount());
        }
    }

    public Product[] getProducts() {
        return products;
    }
    public String getName() {
        return name;
    }
}
