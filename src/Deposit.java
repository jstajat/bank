import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Deposit implements Deal {

    private LocalDateTime time;
    private final long money;

    Deposit(long money) {
        this.money = money;
    }


    @Override
    public long operation(long base) {
        time = LocalDateTime.now();
        return base+money;
    }

    ;

    @Override
    public String toString() {
        return "Deposit " + money + " on " + time.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }
}
