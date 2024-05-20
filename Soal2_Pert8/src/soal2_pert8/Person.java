package soal2_pert8;

// Person.java
public class Person {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String email;

    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Class: Orang, Nama: " + name + " Alamat: " + address + " Nomor Telepon: " + phoneNumber + " Email: " + email;
    }
}

