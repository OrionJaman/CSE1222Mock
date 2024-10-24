package q1;

public class Worker {
    private String name;
    private double wage;

    public Worker(String name, double wage) {
        this.name = name;
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Wage: " + wage;
    }
}
