package observer;

public class Main {

    public static void main(String[] args) throws Exception {
        Store store = new Store(2);
        User taras = new User("Taras");

        taras.buyStuff(store);
        taras.buyStuff(store);
        taras.buyStuff(store);

        store.goodsDelivery(4);
    }
}
