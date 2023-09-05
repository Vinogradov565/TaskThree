class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;

    public Employee(String fullName, String position, String email, String phoneNumber, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Иванов Иван", "Инженер", "ivanov@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Employee("Петров Петр", "Программист", "petrov@mailbox.com", "891234567", 50000, 45);
        employees[2] = new Employee("Сидоров Андрей", "Дизайнер", "sidorov@mailbox.com", "895555555", 40000, 28);
        employees[3] = new Employee("Козлова Ольга", "Менеджер", "kozlova@mailbox.com", "890101010", 35000, 35);
        employees[4] = new Employee("Новикова Мария", "Аналитик", "novikova@mailbox.com", "896666666", 60000, 50);

        System.out.println("Информация о сотрудниках старше 40 лет:");
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.printInfo();
            }
        }
    }
}
