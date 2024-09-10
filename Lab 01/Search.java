
package javaapplication8;

public class Search {
    public static void main(String[] args) {
        System.out.println("Exercise 1");
        int[] a = {13,26,39,52,65}; 
        int index  = 4;
        int src = a[index];
        System.out.println("Element at Index "+ index + " : " + src);
         System.out.println("Exercise 2");
        int arr1[]={4,6,2,8,10};
        int elmnt=8;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==elmnt){
                System.out.println("Element "+elmnt+" found at index "+i);
            }
        }
         System.out.println("Exercise 3");
      int[] array3={11,22,33,44,55};
       int target=33;
       int left=0;
       int right=array3.length-1;
     
           
       while(left<=right){
             int mid=left+(right-left)/2;
       if(array3[mid]==target){
           System.out.println("element foud at index : "+mid);
           break;
       }
       else if(array3[mid]<target){
         left=mid+1;}
       else{
       right=mid-1;}
           }
        
    }
}
