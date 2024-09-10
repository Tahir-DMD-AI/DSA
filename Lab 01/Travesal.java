
package javaapplication8;

import javax.xml.transform.SourceLocator;

public class Travesal {

    public static void main(String[] args) {
        System.out.println("Exercise 1");
        int[] a = {5,15,25,35,45,55}; 
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
        System.out.println("Exercise 2.");
        for(int i=0; i<a.length; i++){
            System.out.println("Element at Index "+ i + " : " + a[i]);
        }
    }
    
    
}
