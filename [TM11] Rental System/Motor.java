public class Motor extends Kendaraan{
    private int tahun;
    private String warna;

    public Motor(String merk, String nama, int tahun, String warna){
        super(merk, nama);  
        this.tahun = tahun;
        this.warna = warna;
    } 

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Tahun: " + tahun);
        System.out.println("Warna: " + warna);
    }
}
