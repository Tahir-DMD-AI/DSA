
package javaapplication8;

import javax.annotation.processing.ProcessingEnvironment;

public class Insert_EX2 {
    public static void main(String[] args) {
        System.out.println("Excercise 2.");
        int[] arr = new int[6];
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 400;
        arr[4] = 500;
        
        int newElement = 250;
        int position = 2;
        for(int i = arr.length-1; i>position; i--){
            arr[i] = arr[i-1];
        }
        arr[position] = newElement;
        
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
    }
}
