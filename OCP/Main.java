package OCP;

public class Main {
    public static void main(String[] args) {
        // Using my friends names for this code for uniqueness :)
        Customer student = new Customer("Juls", "Student", 500.00);
        Customer senior = new Customer("Wonka", "Senior Citizen", 500.00);
        Customer regular = new Customer("Pia", "Regular", 500.00);

        System.out.println("Student Discounted Price is " + student.applyDiscount(student.getAmount()) + " for " + student.getName());
        System.out.println("Senior Discounted Price is " + senior.applyDiscount(senior.getAmount()) + " for " + senior.getName());
        System.out.println("Regular Discounted Price is " + regular.applyDiscount(regular.getAmount()) + " for " + regular.getName());

    }



}