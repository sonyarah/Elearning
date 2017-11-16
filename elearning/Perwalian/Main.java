public class Main{
	public static void main (String[]args){
	Mahasiswa mhs = new Mahasiswa();
	Dosen data = new Dosen();
	Dosen dosen = new Dosen();

	mhs.perwalian();
	dosen.personal();
	System.out.println ("Matkul yang dipilih : "+mhs.matkul1+", " + mhs.matkul2+", "+ mhs.matkul3);
	System.out.println ("");
	dosen.persetujuan();

		
	}
}