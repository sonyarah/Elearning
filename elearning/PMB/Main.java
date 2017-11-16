public class Main {
	public static void main (String[] args){
		Maba maba = new Maba();
		Akademik akad = new Akademik();
		Keuangan paid = new Keuangan();

		maba.registrasi();
		akad.inputregis(); //extends 
		//akad.registrasi(maba.noreg)
		akad.is_regis(); 
		paid.is_paid();

		//memanggil atribut yang ada di kelas maba dan akad
		System.out.println ("NIM : "+maba.noreg);
		System.out.println ("Nama: "+akad.nama); //extends
		System.out.println ("Jurusan :"+akad.jurusan); //extends

		}
}