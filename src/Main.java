public class Main {

    public static void main(String[] args) throws Exception {

        Employee e1 = new Employee("Semih Yildiz", 1000.0, 45, 2021);

        System.out.println("Tax amount: " + e1.tax());
        System.out.println("Salary Raise: " + e1.raiseSalary());
        System.out.println(e1.toString());
        System.out.println("Salary Bonus: " + e1.bonus());

    }
}