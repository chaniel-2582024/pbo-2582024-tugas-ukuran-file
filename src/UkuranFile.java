import java.util.Scanner;

public class UkuranFile {

    // SATU_KB dipakai sebagai konstanta pembagi supaya hasil KB/MB/GB berupa desimal, bukan dibulatkan ke bawah
    public static final double SATU_KB = 1024.0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama file    : ");
        String namaFile = input.nextLine();

        System.out.print("Ukuran (byte): ");
        long ukuranByte = input.nextLong();

        double ukuranKB = ukuranByte / SATU_KB;
        double ukuranMB = ukuranKB / SATU_KB;
        double ukuranGB = ukuranMB / SATU_KB;

        int mbDibulatkan = (int) ukuranMB;
        double selisihPembulatan = ukuranMB - mbDibulatkan;

        System.out.println();
        System.out.println("----- UKURAN FILE -----");
        System.out.println(namaFile);
        System.out.println(ukuranByte + " byte");
        System.out.println(ukuranKB + " KB");
        System.out.println(ukuranMB + " MB");
        System.out.println(ukuranGB + " GB");
        System.out.println();
        System.out.println("Dibulatkan ke MB : " + mbDibulatkan);
        System.out.println("Selisih pembulatan: " + selisihPembulatan);

        input.close();
    }
}