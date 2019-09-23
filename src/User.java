import java.util.ArrayList;
import java.util.List;

public class User {



    private Long balance;


    private final String name;
    private List<Deal> dealList = new ArrayList<>();


    public User(String name) {
        this.name = name;
        this.balance = 0L;
    }

    void executeOperation(Deal deal) {

        try{balance = deal.operation(balance);
        dealList.add(deal);}
        catch (IllegalArgumentException e){
            System.out.println("Deal cancelled : " + e.getMessage());
        }

    }

    String getName() {
        return name;
    }

    Long getBalance() {
        return balance;
    }


    public void statement(){
        System.out.println("------------------------------------------");
        System.out.println("User " + name + "has a balance equals to ");
        for(Deal d:dealList){
            System.out.println(d);
        }
    }


}
