import java.time.LocalDate;
import java.util.ArrayList;
public class Patient {
    private String noMedicalRecords;
    private String name;
    private ArrayList<Consultation> consultationHistory;

    public String getNoMedicalRecords(){
        return noMedicalRecords;
    }
    public void setNoMedicalRecords(String noMedicalRecords){
        this.noMedicalRecords = noMedicalRecords;
    }
    public String getName(){
        return name;
    }
    public void setName (String name){
        this.name = name;
    }

    public Patient(String noMedicalRecords, String name){
        this.noMedicalRecords = noMedicalRecords;
        this.name = name;
        this.consultationHistory = new ArrayList<Consultation>();
    }

    public String getInfo(){
        String info = "";
        info += "No Medical Records      : " + this.noMedicalRecords + "\n";
        info += "Name                    : " + this.name + "\n";
        info += "\n";

        if(!consultationHistory.isEmpty()){
            info += "Consultation History :\n";

            for (Consultation consultation : consultationHistory){
                info += consultation.getInfo();
            }
        }else{
            info += "No Consultation History";
        }

        info += "\n";
        return info;
    }

    public void addConsultation (LocalDate date, Employee doctor, Employee nurse){
        Consultation consultation = new Consultation();
        consultation.setDate(date);
        consultation.setDoctor(doctor);
        consultation.setNurse(nurse);
        consultationHistory.add(consultation);
    }
}
