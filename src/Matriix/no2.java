package Matriix;
public class no2{
    public static void main(String[] args){
        String myName="Nama Lengkap : Rizqon Fadillah";
		System.out.println(myName);
        String myNumber = "NIM : 20090140";
                System.out.println(myNumber);
                System.out.println();
                
        int[][] A = {{4, 5, 2},{5, 7, 9},}; 
        int[][] B ={{1, 3, 1},{3, 4, 6},};       
        if((A. length    == B.length) &&(A[0].length == B[0].length)){
            int[][] C = new int [A.length][A[0].length];
            for(int i = 0; i<A.length;i++){
                for(int j = 0; j<A[0].length; j++){
                    C[i][j] = A[i][j] - B[i][j];
                }    
            }
            for(int[] c: C){
                for(int q: c){
                    System.out.println(q+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Ukuran matriks Beda");
        }
    }    
}
