package bubblesort1;
public class BubbleSort1 {
    public void bubbleshort(int[] arr){
        int count = 0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1; j++){
                count++;
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Total step "+count);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
//    task 2
    public void Earlybubbleshort(int[] arr){
        boolean flag;
        int count1 = 0;
        for(int i=0; i<arr.length-1; i++){
            flag = false;
            for(int j=0; j<arr.length-1-i; j++){
                count1++;
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(flag == false ){
                System.out.println("Total step "+count1);
                break;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
//    task 3
    public void Stringbubbleshort(String[] arr){
        boolean flag ;
        int count2 = 0;
        for(int i=0; i<arr.length-1; i++){
            flag = false;
            for(int j=0; j<arr.length-1; j++){
                count2++;
                if(arr[j].length() > (arr[j+1]).length()){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                    flag = true;
                }
            }
            if(flag == false ){
                System.out.println("Total step "+count2);
                break;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        String[] fruit = {"apple","pie","banana","cat"};
        int[] arr = {5,1,4,3,6,2};
        BubbleSort1 b1 = new BubbleSort1();
        b1.Stringbubbleshort(fruit);
        System.out.println();
        b1.bubbleshort(arr);
        System.out.println();
        b1.Earlybubbleshort(arr);
    }
    
}
