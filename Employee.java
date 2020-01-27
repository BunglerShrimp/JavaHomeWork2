package homework4;

public class Employee {
    private String fio;
    private String position;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fio, String position, String phone, int salary, int age) {
        setFio(fio);
        setPosition(position);
        setPhone(phone);
        setSalary(salary);
        setAge(age);
    }

    public String toString() {
        return "Employee fio='" + getFio() + "  position='" + getPosition() + ", phone='" + getPhone() + ", salary=" + getSalary() + ", age=" + getAge();
    }

    public void getEmployeeInfo() {
        System.out.println(this);
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
// Метод увеличивающий з.п. сотрудников 45 лет или старше на 5000
    public int getSalary() {
        if (getAge() >= 45)
            return salary + 5000;
        return 0;
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;

    }

    public void setAge(int age) {
        this.age = age;
    }
    
}

