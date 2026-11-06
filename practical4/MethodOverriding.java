
class Employee {

    double calculatePay() {
        return 20000;
    }
}

class FullTimeEmployee extends Employee {

    @Override
    double calculatePay() {
        return 50000;
    }
}

class PartTimeEmployee extends Employee {

    @Override
    double calculatePay() {
        return 15000;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {

        Employee e;

        e = new FullTimeEmployee();
        System.out.println("Full Time Employee Pay: " + e.calculatePay());

        e = new PartTimeEmployee();
        System.out.println("Part Time Employee Pay: " + e.calculatePay());
    }
}
