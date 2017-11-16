import java.util.Scanner;

class Mahasiswa {
	String nama, nim, kelas, matkul1, matkul2, matkul3;

	void personal(){
	Scanner input = new Scanner (System.in);

	System.out.println ("_______________________________________");
	System.out.println ("\t Pemilihan Rencana Studi ");
	System.out.println ("\t Data Mahasiswa");
	System.out.print ("Nama Mahasiswa		: ");
	nama = input.nextLine();

	System.out.print ("NIM 			: ");
	nim = input.nextLine();

	System.out.print ("Kelas			: ");
	kelas = input.nextLine();

	System.out.println ("_______________________________________");
	}

	void perwalian(){
	Scanner input = new Scanner (System.in);
	System.out.println ("");
	System.out.println ("Rencana Studi");
	System.out.print ("1 ");
	matkul1 = input.nextLine();
	System.out.print ("2 ");
	matkul2 = input.nextLine();
	System.out.print ("3 ");
	matkul3 = input.nextLine();
	}
}