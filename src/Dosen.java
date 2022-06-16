import java.util.ArrayList;

public class Dosen {
    private String kdDosen, nama;
    public ArrayList<String> studentID= new ArrayList<String>();

    public Dosen() {
    }

    public Dosen(String kdDosen, String nama) {
        this.kdDosen = kdDosen;
        this.nama = nama;
    }

    public String getKdDosen() {
        return this.kdDosen;
    }

    public void setKdDosen(String kdDosen) {
        this.kdDosen = kdDosen;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStudentID(){
        String hasil="\n";
        for (String stID : studentID) {
            hasil +=stID +"\n";
        }
        return hasil;
    }

    @Override
    public String toString() {
        return "{" +
            " kdDosen='" + getKdDosen() + "'" +
            ", nama='" + getNama() + "'" +
            ", studentID='" + getStudentID() + "'" +
            "}";
    }

}
