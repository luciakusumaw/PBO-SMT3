package Experiment;

public class Dosen extends Pegawai {
    public String nidn;

    public Dosen(String nip, String name, double salary, String nidn) {
        super (nip, name, salary); 
        this.nidn = nidn;
    }

    public String getAllInfo() {
        String info = "";
        info += "NIP             : " + super.nip + "\n";
        info += "NAME            : " + super.name + "\n";
        info += "SALARY          : " + super.salary + "\n";
        info += "NIDN            : " + this.nidn + "\n";
        return info;
    }
}