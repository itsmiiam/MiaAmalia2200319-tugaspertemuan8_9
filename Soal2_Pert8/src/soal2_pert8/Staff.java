package soal2_pert8;

// Staff.java
public class Staff extends Employee {
    private final String title;

    public Staff(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Class: Anggota Staf, Nama: " + name + " Alamat: " + address + " Nomor Telepon: " + phoneNumber + " Email: " + email +
                " Kantor: " + office + " Gaji: " + salary + " Tgl Kerja: " + dateHired + 
                " Gelar: " + title;
    }
}