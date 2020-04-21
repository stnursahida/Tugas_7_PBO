/* Nama : Siti Nursahida Imlan
   Nim  : 13020180104
   waktu : 20 April 2020
*/
public class Manusia extends MakhlukHidup {
    private String duaKaki;
    public Manusia(String duaKaki){
        this.duaKaki = duaKaki;
    }
    public void berdiri (){
        System.out.println("Manusia berdiri menggunakan :  "+duaKaki);
    }
}
