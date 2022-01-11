import java.util.Scanner;

class Student {
    String name, std;
    int roll_no, sub_mark1, sub_mark2, sub_mark3;

    Student(String name, int roll_no, String std, int sub_mark1, int sub_mark2, int sub_mark3) {
        this.name = name;
        this.roll_no = roll_no;
        this.std = std;
        this.sub_mark1 = sub_mark1;
        this.sub_mark2 = sub_mark2;
        this.sub_mark3 = sub_mark3;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Standard: " + std);
        System.out.println("Subject 1: " + sub_mark1);
        System.out.println("Subject 2: " + sub_mark2);
        System.out.println("Subject 3: " + sub_mark3);
        System.out.println("Average: " + (sub_mark1 + sub_mark2 + sub_mark3) / 3);
        int percentage = ((sub_mark1 + sub_mark2 + sub_mark3) / 3);
        System.out.println("Percentage: " + percentage + "%");
        System.out.print("Grade: ");
        if (percentage > 60) {
            System.out.println("1st Division");
        } else if (percentage > 40 && percentage < 60) {
            System.out.println("2nd Division");
        } else if (percentage < 40 && percentage > 25) {
            System.out.println("3rd Division");
        } else {
            System.out.println("Failed");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.print("Enter the roll no: ");
        int roll_no = sc.nextInt();
        System.out.print("Enter the standard: ");
        String std = sc.next();
        System.out.print("Enter the subject 1 marks: ");
        int sub_mark1 = sc.nextInt();
        System.out.print("Enter the subject 2 marks: ");
        int sub_mark2 = sc.nextInt();
        System.out.print("Enter the subject 3 marks: ");
        int sub_mark3 = sc.nextInt();

        Student s = new Student(name, roll_no, std, sub_mark1, sub_mark2, sub_mark3);
        s.display();

        sc.close();
    }
}