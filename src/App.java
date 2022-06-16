public class App {
    public static void main(String[] args) throws Exception {

       Mahasiswa mahasiswa = new Mahasiswa("123456","Franky");
      
       Dosen dosen = new Dosen("01234", "Budi");
       dosen.studentID.add("123456");
       dosen.studentID.add("123457");
       dosen.tambahMhs(mahasiswa);
       System.out.println(dosen);
       System.out.println(mahasiswa);
    }
}
