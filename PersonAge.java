import java.util.Scanner;

// 12. Write a program to calculate the age of a person, and check its
// validation by creating your own exceptions.

class InvalidAgeException extends Exception {
    public InvalidAgeException(String exp) {
        super(exp);
    }
}

class CheckAge {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        try {
            if (age > 1 && age < 60) {
                System.err.println("You are eligible to Work");
            } else {
                throw new InvalidAgeException("You are not allowed to work");
            }
        } catch (InvalidAgeException e) {
            System.err.println(e.getLocalizedMessage());
        }
    }
}