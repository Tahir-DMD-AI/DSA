
package javaapplication8;

public class insert_Ex3 {
    public static void main(String[] args) {
        System.out.println("Excercise 3.");
        int[] arr = new int[6];
        arr[0] = 3;
        arr[1] = 6;
        arr[2] = 9;
        arr[3] = 12;
        arr[4] = 15;
        
        int newElement = 18;
        arr[arr.length-1] = newElement;
        
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
    }
}
