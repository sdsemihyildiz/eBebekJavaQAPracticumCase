public class Main {

    public static void main(String[] args) throws Exception {

        //Kontrol amaçlı oluşturulmuş bir main

        Employee e1 = new Employee("Semih Yildiz", 16500, 45, 2010);

        System.out.println(e1);
        System.out.println("Tax amount: " + e1.tax());
        System.out.println("Salary Bonus: " + e1.bonus());
        System.out.println("Salary Raise: " + e1.raiseSalary());

    }
}