
package javaapplication8;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
          Scanner input=new Scanner(System.in);
      String str1=input.next();
      int left=0;
      int right=str1.length()-1;
      boolean palndrome=true;
      while(left<=right){
          if(str1.charAt(left)!=str1.charAt(right)){
 
              palndrome=false;
              break;
          }
          else{
          left++;
          right--;
        }
      }
      if(palndrome==true){
          System.out.println(" The word is Palindrome ");
      }else{
          System.out.println("The word is not palindrome");}
    }
}
