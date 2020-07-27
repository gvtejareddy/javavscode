package hackerrank;

public class soltwo {
    public static void main(String[] args) {
        int [][] arr = {{1, 1, 1, 0, 0, 0},
        {0, 1,0, 0, 0, 0},
        {1, 1, 1, 0, 0, 0},
        {0, 0 ,2 ,4, 4,0},
        {0, 0, 0, 2, 0, 0},
        {0, 0,1, 2, 4, 0}};


        for (int i = 0; i < 6; i++) { 
            for (int j = 0; j < 6; j++) { 
                System.out.print(arr[i][j] + " "); 
            } 
  
            System.out.println(); 
        }
    }
}