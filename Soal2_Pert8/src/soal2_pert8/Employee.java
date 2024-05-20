package soal2_pert8;


// Employee.java
public class Employee extends Person {
    protected String office;
    protected double salary;
    protected MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Class: Karyawan, Nama: " + name + " Alamat: " + address + " Nomor Telepon: " + phoneNumber + " Email: " + email + 
                " Kantor: " + office + " Gaji: " + salary + " Tgl Kerja: " + dateHired;
    }
}
