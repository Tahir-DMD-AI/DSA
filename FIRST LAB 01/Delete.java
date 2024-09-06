
package javaapplication8;

public class Delete {
    public static void main(String[] args) {
        System.out.println("Exercise 1");
        System.out.println("Before delete ");
        int[] a = {8,16,24,32,40};
         for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
         }
        int dele = 2;
        for(int i=dele; i<a.length-1; i++){
            a[i] = a[i+1];
        }
        System.out.println();
        a[a.length-1] = 0;
        System.out.println("after delete");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
