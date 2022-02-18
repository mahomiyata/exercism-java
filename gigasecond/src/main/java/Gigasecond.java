import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Gigasecond {

    LocalDateTime afterGigasecond;

    public Gigasecond(LocalDate moment) {
        LocalTime temp = LocalTime.of(0, 0);
        this.afterGigasecond = LocalDateTime.of(moment, temp);
        this.afterGigasecond = this.afterGigasecond.plusSeconds(1000000000);
    }

    public Gigasecond(LocalDateTime moment) {
        this.afterGigasecond = moment.plusSeconds(1000000000);
    }

    public LocalDateTime getDateTime() {
        return this.afterGigasecond;
    }
}
