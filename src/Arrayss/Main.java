package Arrayss;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Arrayss arr =new Arrayss();
        int [] numbers={1,2,3,4,5,6,8,10,9,7};
        Arrays.sort(numbers);
       // numbers[3]=7;
       // int []numbers2=new int[7];
       //  arr.update(numbers,8,7);
       // arr.delete(numbers,2);
        //arr.input(numbers2);
       // arr.ReverseTraversal(numbers);
        arr.Traversal(numbers);
       //arr.Traversal2(numbers2);
        // int result =arr.LinearSreach(numbers,5);
        int result =arr.BinarySearch(numbers,0, numbers.length-1, 9);
         if(result!=-1)
         System.out.println("value found at index:"+ result);
         else
             System.out.println("value not found at index :");



       // System.out.println("please enter element");
      //  numbers[0]=A.nextInt();


        //  int [] numbers= new int[5];
      //  System.out.println(Arrays.toString(numbers));

        //int [] number ={1,2,3,4};
       // for(int i=0;i<number.length;i++)
           // System.out.ph
       // for(int e:number)
          //  System.out.println(e);


 // int [] number={1,2,3};
  //number[0]=6;






    }
}











