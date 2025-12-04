package Arrayss;

import java.util.Scanner;

public class Arrayss {
    Scanner scanner=new Scanner(System.in);
    public void Traversal(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.println("Index[" + i + "] = " + a[i]);

    }

    public void Traversal2(int[] a) {
        for (int e : a)
            System.out.println(e);
    }

        public void ReverseTraversal (int[] a){
            for (int i = a.length - 1; i >= 0; i--)
                System.out.println("Index[" + i + "]=" + a[i]);

        }

    public void input(int[] a) {
        System.out.println("plaease enter " + a.length + " element");
        for (int i = 0; i <a.length; i++)
            a[i]=scanner.nextInt();
    }
    public void update(int[]a,int index,int nvalue){
        if(index<0 ||index>=a.length)
            System.out.println("Index not found");
        else
          a[index]=nvalue;

    }
    public void delete(int[]a,int index) {
        if (index < 0 || index >= a.length)
            System.out.println("Index not found");
        else
            a[index] =0;
    }
    public int LinearSreach(int[]a, int svalue) {
        for (int i = 0; i < a.length; i++) {
            if (svalue == a[i])
                return i;
        }
        return -1;
    }
    //{1,2,3,4,5}
    public int BinarySearch(int[]a,int findex,int lindex, int svalue){
        while(findex<=lindex){
            int mid=(findex+lindex)/2;
            if(svalue==a[mid])
                return mid;
            if(svalue>a[mid])
                findex=mid+1;
            if(svalue<a[mid])
                lindex=mid-1;

        }
        return -1;
    }
}

