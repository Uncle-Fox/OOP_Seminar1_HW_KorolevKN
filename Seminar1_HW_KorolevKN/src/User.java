public class User{
    protected String name;
    protected String password;

    private Basket basket;

    public User(String name, String password, Basket basket) {
        this.name = name;
        this.password = password;
        this.basket = basket;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
    public void getBasket() {
        System.out.println("В корзине у " + getName() + ":");
        basket.getProducts();
    }
    public void exitShop(){
        System.out.println(name + " ушел из магазина, купив продукты.");
        getBasket();
    }
}
