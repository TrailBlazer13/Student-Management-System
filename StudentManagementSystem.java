import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:students.db";

        Repository repo = new Repository(url);
        repo.initializeDatabase();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for 10 students:");

        for (int i = 1; i <= 10; i++) {
            System.out.println("\nStudent " + i + ":");

            System.out.print("First name: ");
            String firstName = scanner.nextLine();

            System.out.print("Last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Age: ");
            int age = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Gender: ");
            String gender = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Phone Number: ");
            String phone = scanner.nextLine();

            System.out.print("Address: ");
            String address = scanner.nextLine();

            System.out.print("Course: ");
            String course = scanner.nextLine();

            System.out.print("Year Level: ");
            int yearLevel = Integer.parseInt(scanner.nextLine());


            Student student = new Student.Builder()
            .setFirstName(firstName)
            .setLastName(lastName)
            .setAge(age)
            .setGender(gender)
            .setEmail(email)
            .setPhoneNumber(phone)
            .setAddress(address)
            .setCourse(course)
            .setYearLevel(yearLevel)
            .build();


            repo.addStudent(student);

        }

        // Retrieve and print master list
        List<Student> students = repo.getAllStudents();
        System.out.println("\n=== MASTER LIST OF STUDENTS ===");
        for (Student s : students) {
            System.out.println(s);
        }

        scanner.close();
    }
}
