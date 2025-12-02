package Arrayss;

import java.util.Scanner;

public class Arrayss {
    Scanner scanner=new Scanner(System.in);
    public void Traversal(int[] a) {
        for (int w = 0; w < a.length; w++)
            System.out.println("Index[" + w + "] = " + a[w]);

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
}

