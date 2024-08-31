package ConsoleApp;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Student implements Serializable {
    private  String id;
    private String name;
    private int age;

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }
}

public class StudentManagementApp {
    private static final String FILE_NAME = "students.dat";
    private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        loadStudents();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. List Students");
            System.out.println("3. Search Student");
            System.out.println("4. Modify Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    listStudents();
                    break;
                case 3:
                    searchStudent(scanner);
                    break;
                case 4:
                    modifyStudent(scanner);
                    break;
                case 5:
                    saveStudents();
                    System.out.println("Exiting the program...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addStudent(Scanner scanner) {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Student Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        students.add(new Student(id, name, age));
        System.out.println("Student added successfully!");
    }

    private static void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("Listing all students:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    private static void searchStudent(Scanner scanner) {
        System.out.print("Enter Student ID to search: ");
        String id = scanner.nextLine();
        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println("Student found: " + student);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    private static void modifyStudent(Scanner scanner) {
        System.out.print("Enter Student ID to modify: ");
        String id = scanner.nextLine();
        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.print("Enter new name: ");
                String name = scanner.nextLine();
                System.out.print("Enter new age: ");
                int age = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                student.setName(name);
                student.setAge(age);
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    private static void loadStudents() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            students = (ArrayList<Student>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("No data found, starting with an empty student list.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading students: " + e.getMessage());
        }
    }

    private static void saveStudents() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(students);
        } catch (IOException e) {
            System.out.println("Error saving students: " + e.getMessage());
        }
    }
}
