package soal2_pert8;

// Faculty.java
public class Faculty extends Employee {
    private final String officeHours;
    private final String rank;

    public Faculty(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Class: Anggota Fakultas, Nama: " + name + " Alamat: " + address + " Nomor Telepon: " + phoneNumber + " Email: " + email +
                " Kantor: " + office + " Gaji: " + salary + " Tgl Kerja: " + dateHired + 
                " Jam Kerja: " + officeHours + " Pangkat: " + rank;
    }
}