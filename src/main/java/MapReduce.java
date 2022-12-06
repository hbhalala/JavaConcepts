import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapReduce {
    public static void main(String[] args) {
        double average = EmployeeInitializer.getEmployees().stream().filter(a->a.getBand().equalsIgnoreCase("LEAD"))
                .map(a->a.getSalary())
                .mapToDouble(i->i)
                .average().getAsDouble();
        System.out.println(average);

        double sum = EmployeeInitializer.getEmployees().stream().filter(a->a.getBand().equalsIgnoreCase("LEAD"))
                .map(a->a.getSalary())
                .mapToDouble(i->i)
                .sum();
        System.out.println(sum);
    }
}

class Employee {
    private int id;
    private String name;
    private String band;
    private double salary;

    public Employee(int id, String name, String band, double salary) {
        this.id = id;
        this.name = name;
        this.band = band;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", band='" + band + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class EmployeeInitializer {

    public static List<Employee> getEmployees() {
        return Stream.of(new Employee(1, "first", "senior", 40000),
                new Employee(2, "first", "lead", 50000),
                new Employee(3, "first", "senior", 38000),
                new Employee(4, "first", "lead", 52000),
                new Employee(5, "first", "senior", 42000))
                .collect(Collectors.toList());
    }

}
