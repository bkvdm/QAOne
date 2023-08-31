import java.util.Scanner;
public class Main {
    //    private static Employee[] employeeDataArchive = new Employee[10];
    public static void main(String[] args) {

//        employeeDataArchive();

        task1();
    }
    public static int departmentNumberGenerator() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(5) + 1;
        }
        int departmentNumberGenerator = arr[0];
        return departmentNumberGenerator;
    }
    public static int salaryValueGenerator() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        int salaryValueGenerator = arr[0];
        return salaryValueGenerator;
    }
    public static Employee [] employeeDataArchive() {

        Employee employee1 = new Employee("Иванов", "Иван", "Иванович", departmentNumberGenerator(), salaryValueGenerator());
        Employee employee2 = new Employee("Петров", "Пётр", "Петрович", departmentNumberGenerator(), salaryValueGenerator());
        Employee employee3 = new Employee("Новая", "Мария", "Олеговна", departmentNumberGenerator(), salaryValueGenerator());
        Employee employee4 = new Employee("Симонов", "Тимофей", "Трифонович", departmentNumberGenerator(), salaryValueGenerator());
        Employee employee5 = new Employee("Виноградова", "Анастасия", "Викторовна", departmentNumberGenerator(), salaryValueGenerator());
        Employee employee6 = new Employee("Неизвестный", "Никита", "Константинович", departmentNumberGenerator(), salaryValueGenerator());
        Employee employee7 = new Employee("Громыко", "Павел", "Ханович", departmentNumberGenerator(), salaryValueGenerator());
        Employee employee8 = new Employee("Ким", "Юрий", "Леонидович", departmentNumberGenerator(), salaryValueGenerator());
        Employee employee9 = new Employee("Великий", "Антон", "Александрович", departmentNumberGenerator(), salaryValueGenerator());
        Employee employee10 = new Employee("Крымская", "Маргарита", "Вячеславовна", departmentNumberGenerator(), salaryValueGenerator());

        Employee[] employeeDataArchive = new Employee[10];
        employeeDataArchive[0] = employee1;
        employeeDataArchive[1] = employee2;
        employeeDataArchive[2] = employee3;
        employeeDataArchive[3] = employee4;
        employeeDataArchive[4] = employee5;
        employeeDataArchive[5] = employee6;
        employeeDataArchive[6] = employee7;
        employeeDataArchive[7] = employee8;
        employeeDataArchive[8] = employee9;
        employeeDataArchive[9] = employee10;

        return employeeDataArchive;
    }