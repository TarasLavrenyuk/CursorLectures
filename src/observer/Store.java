package observer;

import java.util.HashSet;
import java.util.Set;

public class Store {

    private int numberOfGoods;

    private Set<User> waitingList = new HashSet<>();

    public Store(int numberOfGoods) {
        this.numberOfGoods = numberOfGoods;
    }

    public void goodsDelivery(int numberOfGoods) throws Exception {
        if (numberOfGoods < 1) {
            throw new Exception("Bad argument!!!");
        }
        if (this.numberOfGoods == 0) {
            notifyBuyers();
        }
        this.numberOfGoods += numberOfGoods;
    }

    private void notifyBuyers() {
        for (User user : waitingList) {
            user.goToStore();
        }
        waitingList.clear();
    }

    public void subscribe(User user) {
        waitingList.add(user);
    }

    public boolean sell() {
        if (numberOfGoods >= 1) {
            numberOfGoods--;
            return true;
        }
        return false;
    }
}
