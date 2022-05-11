package interviewsettwo;



public class Arraysjava {
    private static int myArrays [] = {2,3};

    private static int dArray [][] = {{12,13},{23,24}};
    public static void main(String[] args) {
        System.out.println(myArrays[0]); 
        new Arraysjava();
        System.out.println(Arraysjava.myArrays[0]); 

        for(int i=0;i<dArray.length;i++){
            for( int j =0 ;j<dArray.length;j++){
                    System.out.println(dArray[i][j]);
            }
        }
    }
    public Arraysjava(){
        System.out.println(myArrays[0]);
    }
    public void oneMore(){
        System.out.println(myArrays.toString());  
    }
    //{System.out.println(myArrays.toString()); }
    
}
