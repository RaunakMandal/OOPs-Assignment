class Employee {
    protected String name;
    protected int age;

    Employee(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        // display the name and age
        System.out.println("Employee -> Name: " + name + " Age: " + age);
    }
}

class Worker extends Employee {
    int hoursWorked;
    int salaryPerHour;

    Worker(String name, int age, int hw, int sph) {
        super(name, age);
        // call base class constructor
        // initialize hoursWorked and salaryPerHour
        this.hoursWorked = hw;
        this.salaryPerHour = sph;
    }

    int totalSalary() {
        // calculate total salary
        // return total salary
        return hoursWorked * salaryPerHour;
    }

    void display() // override base class display method
    {
        // call base class display
        // display total salary
        super.display();
        System.out.println("Worker -> Total Salary: " + totalSalary());
    }
}

class Manager extends Employee {
    String dept;
    int salary;

    Manager(String name, int age, String dept, int salary) {
        // call base class constructor to initialize name and age
        // initialize the dept and salary
        super(name, age);
        this.dept = dept;
        this.salary = salary;
    }

    void display() // override base class display method
    {
        // call base class display
        // display department and salary
        super.display();
        System.out.println("Manager -> Department: " + dept + " Salary: " + salary);
    }

}

class EmployeeNew {
    public static void main(String[] args) {
        Employee e1 = new Employee("John", 30);
        e1.display();
        Worker worker = new Worker("Mary", 25, 40, 100);
        worker.display();
        Manager manager = new Manager("Mike", 35, "Sales", 20000);
        manager.display();
    }
}