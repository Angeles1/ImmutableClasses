package is2practicaaula1;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.execute();
        // TODO code application logic here
    }
    private final Map<String, Person> persons = new HashMap<>();
    private final List<PersonWeight> personWeight = new ArrayList<>();

    public Main() {
        persons.put("Gabriel", new Person("Gabriel", LocalDate.of(1961, Month.APRIL, 3)));
        persons.put("Angeles", new Person("Angeles", LocalDate.of(1991, Month.MARCH, 2)));
        persons.put("Angela", new Person("Angela", LocalDate.of(1992, Month.AUGUST, 26)));

        personWeight.add(new PersonWeight(LocalDate.of(2016, Month.OCTOBER, 1), persons.get("Gabriel"), 68.9));
        personWeight.add(new PersonWeight(LocalDate.of(2016, Month.MARCH, 5), persons.get("Angeles"), 57.6));

    }

    private void execute() {
        output();
    }

    private void output() {
        for (Person person : persons.values()) {
            System.out.println(person.getName() + " nacio el " + person.getBirthday());
            for (PersonWeight personWeight : personWeight) {
                if (personWeight.getPerson() != person) {
                    continue;
                }
                System.out.println(" En la fecha " + personWeight.getDate() + "  pesa " + personWeight.getWeight() + " kilos.");
            }

        }
    }

}
