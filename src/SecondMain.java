import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import static java.util.Locale.filter;

public class SecondMain {
    public static void main(String[] args) {
        Person dadFirst = new Person("Artem", null, null);
        Person dadSecond = new Person("Vladimir", null, null);
        Person dadThird = new Person("Aleksander", null, null);
        Person dadFourth = new Person("Nikolaj", null, null);

        Person momFirst = new Person("Svetlana", null,null);
        Person momSecond = new Person("Nina", null,null);
        Person momThird = new Person("Valentina", null,null);
        Person momFourth = new Person("Zinaida", null,null);

        Person firstPerson = new Person("Ivan",momFirst,dadFirst);
        Person secondPerson = new Person("Pert",momSecond, dadSecond);
        Person thirdPerson = new Person("Sergej", momThird, dadThird);
        Person fourthPerson = new Person("Gilian", momFourth, dadFourth);

        List<Person> people = new ArrayList<>();
        people.add(firstPerson);
        people.add(secondPerson);
        people.add(thirdPerson);
        people.add(fourthPerson);



        List<Person> names = people.stream()
                .filter(Objects::nonNull)
                .flatMap(person -> Stream.of(person.getMom(), person.getDad()))
                .filter(parentsName -> parentsName.getName().length() > 6)
                .toList();
        System.out.println(names);

    }
}