import java.util.Scanner;

public class ProjectBesar {
    static double nilai[][] = new double[8][3];
    static double IP = 0;
    static double IPsementara = 0;
    static String namaMahasiswa;
    static String NIM;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0;;) {
            System.out.println("=======================================================================");
            System.out.println("======================= Menu Akademik Mahasiswa =======================");
            System.out.println("=======================================================================");
            System.out.println("1. Data Mahasiswa");
            System.out.println("2. Daftar Mata Kuliah");
            System.out.println("3. Input Nilai Mata Kuliah");
            System.out.println("4. Cetak Nilai Mata Kuliah");
            System.out.println("5. Lihat Reward (Jika IPK 3.50 keatas)");
            System.out.println("6. Keluar");
            System.out.println("\n====================== Pilih Pada Salah Satu Menu ======================");
            System.out.print("\nPilih Menu: ");
            int menu = input.nextInt();
            if (menu == 1) {
                dataMahasiswa();
            } else if (menu == 2) {
                System.out.println("\n=======================================================================");
                daftarMatkul();
            } else if (menu == 3) {
                inputNilai();
            } else if (menu == 4) {
                cetakNilai();
            } else if (menu == 5) {
                lihatReward();
            } else if (menu == 6) {
                System.out.print("\n=======================================================================");
                System.out.println("\nTerimakasih Telah Menggunakan Tool Ini :)");
                break;
            } else {
                System.out.print("\n=======================================================================");
                System.out.println("\nMAAF ANGKA YANG ANDA MASUKKAN SALAH!");
            }
        }
    }

    static void daftarMatkul() {
        System.out.println("1. Dasar Pemrograman");
        System.out.println("2. Critical Thinking dan Problem Solving");
        System.out.println("3. Keselamatan dan Kesehatan Kerja");
        System.out.println("4. Teknologi Informasi");
        System.out.println("5. Pancasila");
        System.out.println("6. Praktikum Dasar Pemrograman");
        System.out.println("7. Bahasa Inggris 1");
        System.out.println("8. Matematika 1");
    }

    static void inputNilai() {
        double score = 0;
        Scanner input = new Scanner(System.in);
        for (int h = 0; h < nilai.length; h++) {
            System.out.print("\nMasukkan Nilai ");
            if (h == 0) {
                System.out.println("Dasar Pemrograman");
            } else if (h == 1) {
                System.out.println("Critical Thinking Dan Problem Solving");
            } else if (h == 2) {
                System.out.println("Keselamatan dan Kesehatan Kerja");
            } else if (h == 3) {
                System.out.println("Teknologi Informasi");
            } else if (h == 4) {
                System.out.println("Pancasila");
            } else if (h == 5) {
                System.out.println("Praktikum Dasar Pemrograman");
            } else if (h == 6) {
                System.out.println("Bahasa Inggris 1");
            } else if (h == 7) {
                System.out.println("Matematika 1");
            }
            for (int i = 0; i < nilai[0].length; i++) {

                System.out.print("Masukkan Nilai ");
                if (i == 0) {
                    System.out.print("Kuis: ");
                } else if (i == 1) {
                    System.out.print("UTS: ");
                } else if (i == 2) {
                    System.out.print("UAS: ");
                }
                nilai[h][i] = input.nextDouble();

            }
            nilai[h][2] = nilai[h][0] * 0.2 + nilai[h][1] * 0.3 + nilai[h][2] * 0.5;
        }
        IPsementara = (nilai[0][2] + nilai[1][2] + nilai[2][2] + nilai[3][2] + nilai[4][2] + nilai[5][2] + nilai[6][2]
                + nilai[7][2]);
        IP = (IPsementara / 8) / 25;
        System.out.println("Indeks Prestasi Anda Di Semester Ini Adalah " + IP);
    }

    static void lihatReward() {
        if (IP == 4.00) {
            System.out.println("Selamat Anda Mendapat Hadiah Unta Dari Kampus");
        } else if (IP >= 3.75 && IP < 4.00) {
            System.out.println("Selamat Anda Mendapat Hadiah Sapi Dari Kampus");
        } else if (IP >= 3.50 && IP < 3.75) {
            System.out.println("Selamat Anda Mendapat Hadiah Kambing Dari Kampus");
        } else if (IP < 3.50 && IP != 0) {
            System.out.println("Nilaimu Kurang, Ga Dapet Hadiah Deh :(");
        } else {
            System.out.println("Mohon Memasukkan Nilai Terlebih Dahulu!");
        }
    }

    static void cetakNilai() {
        System.out.println("=============================================");
        System.out.println("===========RAPOR NILAI SEMESTER 1============");
        System.out.println("=============================================");
        System.out.println("Nama: " + namaMahasiswa);
        System.out.println("NIM: " + NIM);
        System.out.println("=============================================");
        System.out.println("Nilai Dasar Pemrograman: " + nilai[0][2]);
        System.out.println("Nilai Critical Thinking dan Problem Solving: " + nilai[1][2]);
        System.out.println("Nilai Keselamatan dan Kesehatan Kerja: " + nilai[2][2]);
        System.out.println("Nilai Teknologi Informasi: " + nilai[3][2]);
        System.out.println("Nilai Pancasila: " + nilai[4][2]);
        System.out.println("Nilai Praktikum Dasar Pemrograman: " + nilai[5][2]);
        System.out.println("Nilai Bahasa Inggris 1: " + nilai[6][2]);
        System.out.println("Nilai Matematika 1: " + nilai[7][2]);
        System.out.println("=============================================");
        System.out.println("Indeks Prestasi (IP): " + IP);
        System.out.println("=============================================");
        if (IP == 4.00) {
            System.out.println("Hadiah: Unta");
        } else if (IP >= 3.75 && IP < 4.00) {
            System.out.println("Hadiah: Sapi");
        } else if (IP >= 3.50 && IP < 3.75) {
            System.out.println("Hadiah: Kambing");
        } else if (IP < 3.50 && IP != 0) {
            System.out.println("Hadiah: Tidak Ada");
        } else {
            System.out.println("Mohon Memasukkan Nilai Terlebih Dahulu!");
        }
    }

    static void dataMahasiswa() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Mahasiswa: ");
        namaMahasiswa = input.nextLine();
        System.out.print("Masukkan NIM: ");
        NIM = input.nextLine();
    }

}