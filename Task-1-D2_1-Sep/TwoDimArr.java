// 14. Create a 2D array to store a multiplication table from 1 to 5.

public class TwoDimArr{

    public static void main(String[] args){

        int n = 5; // size of the multiplication table
        int[][] multiplicationTable = new int[n][n];

        // Multiplication 
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }

        // Print the multiplication table
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(multiplicationTable[i][j] + "\t");
            }
            System.out.println(); // Move to the next row
        }
    }
}


