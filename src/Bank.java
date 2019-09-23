import java.util.ArrayList;
import java.util.List;

public class Bank {
    List<User> users = new ArrayList<>();


    public static void executeDeal(Deal deal, User user) {
        user.executeOperation(deal);
    }

    public static void main(String[] args) {
        Deal d1 = new Deposit(11);
        Deal d2 = new Withdrawal(15);
        Deal d3 = new Withdrawal(6);

        User user = new User("kk");
        user.executeOperation(d1);
        user.executeOperation(d2);
        user.executeOperation(d3);
        user.statement();

    }
}
