package Experiment;

public class Pegawai {
    public String nip;
    public String name;
    public double salary;

    // Parameterized constructor in the parent class
    public Pegawai (String nip, String name, double salary) {
        this.nip = nip;
        this.name = name;
        this.salary = salary;
    }

    public String getInfo() {
        String info = "";
        info += "NIP     : " + nip + "\n";
        info += "NAME    : " + name + "\n";
        info += "SALARY  : " + salary + "\n";
        return info;
    }
}