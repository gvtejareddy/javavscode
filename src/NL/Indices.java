package NL;


public class Indices {

    public static void main(String[] args) {
        int[] myTestArray = {1,2,7,9,9,1,7,2};
        int[] finalArray=Indices.getIndicesIntegers(myTestArray, 9);
        for (int i : finalArray) {
            System.out.println(i);
        }

    }

    public static int[] getIndicesIntegers(int[] testIntegers, Integer target) { 
        int[] indices = { 0, 0 };
        boolean found= false;

        for (int i = 0; i <testIntegers.length; i++) { // 4
            if (!(testIntegers[i] > target)) {
                for (int j = 1; j <testIntegers.length; j++) {
                    if (testIntegers[i] + testIntegers[j] == target) {
                        indices[0] = i;
                        indices[1] = j;
                        found=true;
                        break;
                    }

                }
                    if(found){
                        break;
                    }
            }
        }
        return indices;

    }

}
