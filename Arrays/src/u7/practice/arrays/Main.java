package u7.practice.arrays;

public class Main {

    public static void main(String[] args) {
	    int[] intArray = new int[7];
	    intArray[0] = 10;
        intArray[1] = 1;
        intArray[2] = -10;
        intArray[3] = 75;
        intArray[4] = 0;
        intArray[5] = -81;
        intArray[6] = 210;

        int index = -1;

        for(int i = 0;i < intArray.length; i++){

            if(intArray[i]==75){
                index = i;
                break;
            }
        }
        System.out.println("Index is = "+index);

    }
}
