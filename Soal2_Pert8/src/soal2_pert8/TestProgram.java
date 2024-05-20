package soal2_pert8;

// TestProgram.java
public class TestProgram {
    public static void main(String[] args) {
        Person person = new Person("John Doe", "Geger Kalong-15", "555-1234", "johndoe@example.com");
        Student student = new Student("Alfen Fajri", "Ujung Berung-456", "555-5678", "alfaj@example.com", Student.SENIOR);
        MyDate hireDate = new MyDate(2023, 11, 20);
        Employee employee = new Employee("Alice Bluee", "Cempaka-11", "555-8765", "alicebluee@example.com", "Room 101", 500, hireDate);
        Faculty faculty = new Faculty("Miaal", "Geger Arum-27", "555-4321", "mial1@example.com", "Room 202", 9000, hireDate, "9am - 5pm", "Dekan");
        Staff staff = new Staff("Nurulhaq", "Pondok Hijau-08", "555-6543", "haqq00@example.com", "Room 303", 600, hireDate, "(S. Kom), Sarjana Komputer");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
