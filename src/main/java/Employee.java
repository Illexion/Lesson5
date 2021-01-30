
public class Employee {
    String name;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public Employee(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String employeeInfo() {
        return "Имя: " + name + ", Должность: " + position + ", Email: " + email + ", Телефон: "+ phoneNumber+ ", Зарплата: " + salary + ", Возраст: " + age;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}
