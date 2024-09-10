/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication8;

public class Insert {
    public static void main(String[] args) {
        System.out.println("Excercise 1.");
        int[] arr = new int[6];
        arr[0] = 12;
        arr[1] = 24;
        arr[2] = 36;
        arr[3] = 48;
        arr[4] = 60;
        
        int newElement = 6;
        for(int i = arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = newElement;
        
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        
        
    }
}
