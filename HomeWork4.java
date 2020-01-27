package homework4;

public class HomeWork4 {
    public static void main(String[] args) {

        Employee[] EmployeeArr = new Employee[5];
        EmployeeArr[0] = new Employee("Ivanov Ivan Ivanovich", "Engineer", "89456523215", 35000, 37);
        EmployeeArr[1] = new Employee("Petrov Petr Petrovich", "Manager", "88005553535", 70000,  45);
        EmployeeArr[2] = new Employee("Sergeev Sergey Serdeyevich", "Security", "89456598746", 35000,28);
        EmployeeArr[3] = new Employee("Alexandrov Alexander Alexandrovich", "Cleaner", "89456789955", 25000,  55);
        EmployeeArr[4] = new Employee("Michailov Michail Michailovvich", "Engineer", "89653321515", 40000, 72);

        for (Employee info: EmployeeArr) {
            if (info.getAge() > 40) {
                info.getEmployeeInfo();
            }
        }

        System.out.println();

    }

}

