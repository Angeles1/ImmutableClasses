package is2practicaaula1;

import java.time.LocalDate;

public class Wedding {
    private final LocalDate date;
    private final Person person;

    public Wedding(LocalDate date, Person person) {
        this.date = date;
        this.person = person;
    }

    public LocalDate getDate() {
        return date;
    }

    public Person getPerson() {
        return person;
    }
    
}
