package Experiment;

public class Dosen extends Pegawai {

    public String nidn;
    public Dosen(){
        System.out.println();
        System.out.println("Object from Lecturer class has been made");
    }

    public String getAllInfo(){
        String info = "";
        info += "NIP        : "+ super.nip+ "\n";
        info += "NAME       : "+ super.name+ "\n";
        info += "SALARY     : "+ super.salary+ "\n";
        info += "NIDN       : "+ this.nidn+ "\n";

        return info;
    }
}
