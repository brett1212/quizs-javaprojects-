/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

/**
 *
 * @author SKWilliams
 */
public class ShiftDownTe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] num = {0, 37, 25, 43, 65, 48, 84, 73, 18, 79, 56, 69, 32};
        int j, n = 12;
        heapSort(num, n);
        printheap(num);

    }

    public static void printheap(int[] num) {
        for (int j = 1; j < num.length; j++) {
            System.out.printf("%d ", num[j]);
        }
        System.out.printf("\n");
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

    public static void shiftDown(int key, int[] num, int root, int last) {
        int bigger = 2 * root;
        while (bigger <= last) { //while there is at least one child
            if (bigger < last) // there is a right child as well;find the bigger
            {
                if (num[bigger + 1] > num[bigger]) {
                    bigger++; //bigger hod the index of the bigger child
                }
            }
            if (key >= num[bigger]) {
                break;
            }
            //key is smaller;promote num[bigger]
            num[root] = num[bigger];
            root = bigger;
            bigger = 2 * root;
        }
        num[root] = key;
    }//end shiftDown

    public static void heapSort(int[] num, int n) {
        //sort num[1] to num[n]
        //convert the array to a heap
        for (int k = n / 2; k >= 1; k--) {
            shiftDown(num[k], num, k, n);
        }
        for (int k = n; k > 1; k--) {
            int item = num[k];//extract current last num
            num[k] = num[1]; // move top of heap to currnt last node
            shiftDown(item, num, 1, k - 1); //restore heap properties from 1 to k-1

        }
        
    }//end heapSort
}