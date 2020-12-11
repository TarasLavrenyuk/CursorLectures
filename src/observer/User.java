package observer;

public class User {

    private String name;
    private int numberOfGoods;

    public User(String name) {
        this.name = name;
    }

    public boolean buyStuff(Store store) {
        if (store.sell()) {
            numberOfGoods++;
            System.out.println("Bought!");
            return true;
        } else {
            store.subscribe(this);
            System.out.println("No goods left. Subscribe to updates.");
            return false;
        }
    }

    public void goToStore() {
        System.out.println("I, " + name + " must go to store.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (numberOfGoods != user.numberOfGoods) return false;
        return name != null ? name.equals(user.name) : user.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + numberOfGoods;
        return result;
    }
}
