import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Department: ");
                    String dept = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    System.out.print("Phone: ");
                    String phone = sc.nextLine();

                    Student student = new Student(name, dept, email, phone);
                    dao.addStudent(student);

                    break;

                case 2:

                    List<Student> students = dao.getAllStudents();

                    for (Student s : students) {
                        System.out.println(
                                s.getId() + " | " +
                                s.getName() + " | " +
                                s.getDepartment() + " | " +
                                s.getEmail() + " | " +
                                s.getPhone()
                        );
                    }

                    break;

                case 3:

                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();

                    Student s = dao.searchStudent(id);

                    if (s != null) {
                        System.out.println(s.getId() + " " + s.getName());
                    } else {
                        System.out.println("Student not found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();

                    dao.updateStudent(uid, newName);

                    break;

                case 5:

                    System.out.print("Enter ID to delete: ");
                    int did = sc.nextInt();

                    dao.deleteStudent(did);

                    break;

                case 6:

                    System.out.println("Exiting...");
                    return;

                default:

                    System.out.println("Invalid choice.");
            }
        }
    }
}