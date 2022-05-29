package TechLead.ProgrammingQuestions;

public class BubbleSort {

    static void bubbleSort(int[] a){

int length = a.length;
int temp; 
for( int i =0 ;i<length;i++){
    for(int j=i+1;j<length;j++){
        //[ 2,3,1]
        if( a[i]>a[j]){
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }

}


for (int i : a) {
    System.out.println(i);
}    }
    public static void main(String[] args) {

        int[] arr = {21,3,1,0,9};
        bubbleSort(arr);
    }
    
}
