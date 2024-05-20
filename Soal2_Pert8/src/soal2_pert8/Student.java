package soal2_pert8;

// Student.java
public class Student extends Person {
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    public Student(String name, String address, String phoneNumber, String email, String classStatus) {
        super(name, address, phoneNumber, email);
    }

    @Override
    public String toString() {
        return "Class: Siswa, Nama: " + name + " Alamat: " + address + " Nomor Telepon: " + phoneNumber + " Email: " + email + 
                " Status: " + SENIOR;
    }
}
