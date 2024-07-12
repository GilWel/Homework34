import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SecondMain {
    public static void main(String[] args) {
        Person ivan = new Person("Ivan", "Svetlana", "Artem");
        Person petr = new Person("Pert", "Nina", "Vladimir");
        Person sergej = new Person("Sergej", "Valentina", "Aleksander");
        Person gilian = new Person("Gilian", "Zinaida", "Nikolaj");

        List<Person> people = new ArrayList<>();
        people.add(ivan);
        people.add(petr);
        people.add(sergej);
        people.add(gilian);

        List<String> names = people.stream()
                .filter(person -> person.getName() != null)
                .flatMap(person -> Stream.of(person.getMama(), person.getPapa()))
                .filter(parentsName -> parentsName.length() > 6)
                .toList();
        System.out.println(names);

    }
}