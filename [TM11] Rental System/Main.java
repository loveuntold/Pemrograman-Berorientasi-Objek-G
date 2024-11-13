import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rental rs = new Rental();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("1. Add Kendaraan");
            System.out.println("2. Add Penyewa");
            System.out.println("3. Display Kendaraan");
            System.out.println("4. Display Penyewa");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch(choice){
                case 1:
                    System.out.println("\n");

                    System.out.print("Merk: ");
                    String merk = scanner.nextLine();
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Tahun: ");
                    int tahun = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Warna: ");
                    String warna = scanner.nextLine();
                    System.out.print("Jenis Kendaraan (Mobil/Motor): ");
                    String jenis = scanner.nextLine();

                    if(jenis.equals("Mobil")){
                        Mobil m = new Mobil(merk, nama, tahun, warna);
                        rs.addKendaraan(m);
                    } else if(jenis.equals("Motor")){
                        Motor m = new Motor(merk, nama, tahun, warna);
                        rs.addKendaraan(m);
                    } else{
                        System.out.println("Invalid vehicle type!");
                    }

                    System.out.println("\n");
                    break;

                    case 2:
                    System.out.println("\n");
                    System.out.print("Nama Penyewa: ");
                    String username = scanner.nextLine();
                
                    System.out.println("Kendaraan yang disewa: ");
                    rs.displayKendaraan();
                
                    System.out.print("Pilih kendaraan: ");
                    int idx = scanner.nextInt();
                    scanner.nextLine();
                
                    int adjustedIdx = idx - 1; 
                    if(adjustedIdx >= 0 && adjustedIdx < rs.getKendaraan().size()){
                        System.out.println("\n");
                        System.out.println("Penyewa " + username + " menyewa kendaraan: ");
                        rs.getKendaraan().get(adjustedIdx).displayInfo();  
                        rs.addUser(username);
                    } else {
                        System.out.println("Kendaraan yang dipilih tidak valid.");
                    }
                    System.out.println("\n");
                    break;
                

                case 3:
                    System.out.println("\n");
                    rs.displayKendaraan();
                    System.out.println("\n");
                    break;

                case 4:
                    System.out.println("\n");
                    rs.displayUser();
                    System.out.println("\n");
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while(choice != 5);
    }
}
