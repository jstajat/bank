import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Withdrawal implements Deal {
    private LocalDateTime time;
    private final long money;

    public Withdrawal(long money) {
        this.money = money;
    }

    @Override
    public long operation(long base) {
        if (base - money < 0) throw new IllegalArgumentException("account negative");
        time = LocalDateTime.now();
        return base+money;
    }

    @Override
    public String toString() {
        return "Withdrawal " + money + " on " + time.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }
}
