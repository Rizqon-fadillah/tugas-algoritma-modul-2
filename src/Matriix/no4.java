package Matriix;
    import java.util.Scanner;
        public class no4{
    public static void main (String[] args){
        int i, j, m, n;
        int matrix[][]= new int[2][3];
        int transpose[][] = new int[3][2];
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Jumlah Baris Matrix : ");
        m = scan.nextInt();
        System.out.print("Masukan jumlah kolom Matrix : ");
        n = scan.nextInt();
        System.out.print("Masukan Elemen Matrix : ");
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println("Hasil Matrix : ");
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        for (i = 0; i < m; i++){
            for (j = 0; j < n; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Hasil Transpose Matrix : ");
        for(i = 0; i < n; i++){
            for(j = 0; j < m; j++){
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
    }
}