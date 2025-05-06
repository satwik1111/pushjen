public class Employee {
    String name;
    int id;
    double salary;
    double contact;
    public Employee(String name, int id, double salary,double contact) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.contact=contact;
    }
    public void displayinfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Contact: " + contact);

    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("XYZ", 101, 50000.0,12346678);
        emp1.displayinfo();
    }
}