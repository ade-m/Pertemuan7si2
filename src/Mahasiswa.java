public class Mahasiswa {
    private String studentID,nama;

    public Mahasiswa(String studentID, String nama) {
        this.studentID = studentID;
        this.nama = nama;
    }

    public Mahasiswa() {
    }

    public String getStudentID() {
        return this.studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "{" +
            " studentID='" + getStudentID() + "'" +
            ", nama='" + getNama() + "'" +
            "}";
    }

}
