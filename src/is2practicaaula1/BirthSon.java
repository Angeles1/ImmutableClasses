package is2practicaaula1;

import java.time.LocalDate;

public class BirthSon {
    private final LocalDate date;
    private final Person person;
    private final Person son;

    public BirthSon(LocalDate date, Person person, Person son) {
        this.date = date;
        this.person = person;
        this.son = son;
    }

    public LocalDate getDate() {
        return date;
    }

    public Person getPerson() {
        return person;
    }

    public Person getSon() {
        return son;
    }
    
}
