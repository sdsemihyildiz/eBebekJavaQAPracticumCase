public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() throws Exception {
        if (this.salary < 1000.0 && this.salary > 0.0) {
            return 0.0;
        } else if (this.salary >= 1000.0) {
            return this.salary * 0.03;
        } else {
            throw new Exception("Invalid salary.");
        }
    }

    public int bonus() throws Exception {
        if (this.workHours <= 40 && this.workHours >= 0) {
            return 0;
        } else if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            throw new Exception("Invalid work hours");
        }
    }

    public double raiseSalary() throws Exception {
        if (2021 - this.hireYear < 10 && 2021 - this.hireYear >= 0) {
            return this.salary * 0.05;
        } else if (2021 - this.hireYear > 9 && 2021 - this.hireYear < 20) {
            return this.salary * 0.1;
        } else if (2021 - this.hireYear > 19) {
            return this.salary * 0.15;
        } else {
            throw new Exception("Invalid hire year.");
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return this.workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return this.hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public String toString() {
        return "Employee Name: " + this.name + " Salary: " + this.salary + " Work hours: " + this.workHours + " Hire Year: " + this.hireYear;
    }
}