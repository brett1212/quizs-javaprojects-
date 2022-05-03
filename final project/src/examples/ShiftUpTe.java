/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author SKWilliams
 */
public class ShiftUpTe {
   final static int MaxHeapSize =100;
   public static void main(String [] args) throws IOException
   {
       Scanner in = new Scanner(new FileReader("heap.in"));
       int num[] = new int[MaxHeapSize + 1];
       int j,n=0, number;
       while(in.hasNextInt())
       {
           number =in.nextInt();
           if(n<MaxHeapSize)
           {
               num[++n]=number;
               shiftUp(num,n);
           }
       }
       for(j =1;j<=n;j++) System.out.printf("%d ", num[j]);
        System.out.println("");
        in.close();
        
       
   }
   public static void shiftUp(int [] heap, int n)
   {
       //sifts up the value in heap[n] so that heap [1..n] contains a heap
       int shiftItem = heap[n];
       int child=n;
       int parent= child/2;
       while(parent>0)
       {
           if(shiftItem<=heap[parent]) break;
           heap[child]=heap[parent]; // move down parent
           child=parent;
           parent = child/2;
       }
       heap[child]=shiftItem;
   }
}
