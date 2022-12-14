import java.util.Scanner;

public class Trial {
    public static void main(String[] args) {
        //Code starts below!


//Loops: using For
//        for (int x = 1; x<=10; x++) {
//        System.out.println(x);

// While Loop:
//        int x = 1;
//        while (x<=10)
//        {
//            System.out.println("Value of x: " + x);
//            x++;

        /*
//Using Array Method 1:
        int[] myArray = new int[7]
//          Memory above were assigned as 7 contiguous slots.
        myArray[0] = 0;
//          myArray[o] is the index slot location
        myArray[1] = 1;
        myArray[2] = 3;
        myArray[3] = 4;
         */

//Using Array Method two,
        int[] myArrayII = new int[] {0,1,3,5,7,12,14000};
        System.out.println(myArrayII[6]);
        System.out.println(myArrayII.length);

        for (int i = 0; i< myArrayII.length; i++) {
            System.out.println(myArrayII[i]);
        }

        System.out.println(myArrayII[3] * myArrayII[5]);
    }
}
