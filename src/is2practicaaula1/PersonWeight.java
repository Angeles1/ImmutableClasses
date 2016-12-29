package is2practicaaula1;

import java.time.LocalDate;

public class PersonWeight {
    private final LocalDate date;
    private final Person person;
    private final double weight;

    public PersonWeight(LocalDate date, Person person, double weight) {
        this.date = date;
        this.person = person;
        this.weight = weight;
    }

    public LocalDate getDate() {
        return date;
    }

    public Person getPerson() {
        return person;
    }

    public double getWeight() {
        return weight;
    }

    
}
