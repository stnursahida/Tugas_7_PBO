/* Nama : Siti Nursahida Imlan
   Nim  : 13020180104
   waktu : 20 April 2020
*/
//pewarisan interface

public class show {
	
	public static void main (String[] args) {
		Data d = new Data();
		
		d.namaMhs();
		d.stb();
		d.mk();
		
		System.out.println("Stambuk = " + d.stb());
		System.out.println("Mata kuliah = " + d.mk());
	}
}
