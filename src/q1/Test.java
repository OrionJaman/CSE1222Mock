package q1;

public class Test {
    public static void main(String[] args) {
        Worker worker = new Worker("Pritom", 50000);
        Supervisor supervisor = new Supervisor("Tolune", 60000, "Sales");
        Director director = new Director("Orion", 100000, "Marketing", 500000);

        System.out.println(worker);
        System.out.println(supervisor);
        System.out.println(director);
    }
}
