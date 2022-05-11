package interviewpack;

public class FindSecondHeightestValue {


    private Integer newArray[]={4,100,2};
    public static void main ( String args[]){

            FindSecondHeightestValue findSecondHeightestValue = new FindSecondHeightestValue();
            Integer[] myArray=findSecondHeightestValue.newArray;
            Integer secondMax=0;
            Integer max=0;
            max=myArray[0];
        for ( int i =-1 ;i<myArray.length;i++){
               System.out.println(i);
                if( max > myArray[i+1]){
                    secondMax=myArray[i+1];
                }
                else{
                    secondMax=max;
                    max=myArray[i+1];
                }

        }
     
        System.out.println(secondMax+" "+max);


    }
    
}
