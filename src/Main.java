import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Volkswagen", 1985, 698750);
        Car car2 = new Car("Volvo", 2001, 520780);
        Car car3 = new Car("Mercedes", 2005, 630560);
        Car car4 = new Car("Wolga", 2015, 185200);

        List<Car> carsList = new ArrayList<>();

        carsList.add(car1);
        carsList.add(car2);
        carsList.add(car3);
        carsList.add(car4);

        Optional<Integer> optional = carsList.stream()
                .filter(c -> c.getYear() > 1999 && c.getName() != null)
                .map(Car::getMileage)
                .reduce(Integer::sum);
        int sum = optional.get();
        System.out.println(sum);

        Optional<Car> optional1 = carsList.stream()
                .filter(c -> c.getMileage() > 500000 && c.getName() != null)
                .min(Comparator.comparing(Car::getYear));
        String name = String.valueOf(optional1.get());
        System.out.println(name);

        Optional<Car> optionalCar = carsList.stream()
                .filter(c -> c.getName() != null && c.getMileage() < 200000
                        && (c.getName().startsWith("W") || c.getName().startsWith("V")))
                .max(Comparator.comparing(Car::getMileage));
        String name1 = String.valueOf(optionalCar.get());
        System.out.println(name1);

    }
}