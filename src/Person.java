import java.util.Objects;

public class Person {
    private String name;
    private String mama;
    private String papa;

    public Person(String name, String mama, String papa) {
        this.name = name;
        this.mama = mama;
        this.papa = papa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMama() {
        return mama;
    }

    public void setMama(String mama) {
        this.mama = mama;
    }

    public String getPapa() {
        return papa;
    }

    public void setPapa(String papa) {
        this.papa = papa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(mama, person.mama) && Objects.equals(papa, person.papa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mama, papa);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", mama='" + mama + '\'' +
                ", papa='" + papa + '\'' +
                '}';
    }
}
