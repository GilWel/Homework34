import java.util.Objects;

public class Car {
    private String name;
    private int year;
    private int mileage;

    public Car(String name, int year, int mileage) {
        this.name = name;
        this.year = year;
        this.mileage = mileage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && mileage == car.mileage && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, mileage);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}
