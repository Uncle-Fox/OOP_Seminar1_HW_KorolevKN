public class Main {
    public static void main(String[] args) {

        Product milkOne = new Product("Молочкофф",59.99, 8, 20);
        Product milkTwo = new Product("Изба на хуторе", 120.00, 6, 25);
        Product sausageOne = new Product("Отчим смог", 170.01, 7, 30);
        Product sausageTwo = new Product("Каждый час", 80.49, 3, 40);
        Product breadOne = new Product("Бородинский", 49.49, 8, 50);

        Product[] milkProducts = {milkOne, milkTwo};
        Product[] sausageProducts = {sausageOne, sausageTwo};
        Product[] breadProducts = {breadOne};

        Category milk = new Category("Молоко", milkProducts);
        Category sausage = new Category("Сосиски", sausageProducts);
        Category bread = new Category("Хлеб", breadProducts);

        Basket cartOne = new Basket("Тележка", milkProducts);
        Basket cartTwo = new Basket("Тележка", milkProducts);
        Basket cartThree = new Basket("Тележка", milkProducts);

        System.out.println("---Покупатели стали набирать товары---");
        milkOne.deleteFromProduct(5, "Молочкофф");
        cartOne.addToBasket(5, "Молочкофф");

        sausageOne.deleteFromProduct(2, "Отчим смог");
        cartTwo.addToBasket(2, "Отчим смог");

        System.out.println("---Сейчас в тележках---");
        cartOne.getProducts();
        cartTwo.getProducts();

//        User Ivan = new User("Ivan", "qwerty", cartOne);
//        User Liza = new User("Liza", "1234", cartTwo);
//        User Mark = new User("Mark", "1234", cartThree);
//
//        System.out.println("---Информация про Users---");
//        Ivan.exitShop();
//
//        System.out.println("---Информация про Category---");
//        milk.getAllCategory();

    }
}