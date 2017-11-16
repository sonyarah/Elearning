import java.util.Scanner;

class Maba {
	String nama, email, address, phone, jurusan;
	int noreg;

	
	public	void registrasi(){
		Scanner input = new Scanner (System.in);
		System.out.println ("\t Welcome to Form Registrasi Calon Mahasiswa");
		System.out.print ("Nomor Registrasi: ");
		noreg =input.nextInt();
	
	}

	void inputregis(){
		Scanner input = new Scanner (System.in);
		System.out.println ("___________________________________________________");
		System.out.println ("\t ISI DATA MAHASISWA BARU");

		System.out.print ("\t Name: ");
		nama = input.nextLine();

		System.out.print ("\t Email: ");
		email = input.nextLine();

		System.out.print ("\t Address: ");
		address = input.nextLine();

		System.out.print ("\t Phone: ");
		phone = input.nextLine();

		System.out.print ("\t Jurusan: ");
		jurusan = input.nextLine();

		System.out.println ("___________________________________________________");
	}

	public void tampil(){
		System.out.println ("No Registrasi: "+noreg);
	}
	
}