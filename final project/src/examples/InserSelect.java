/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

/**
 *
 * @author SKWilliams
 */
public class InserSelect {
    
public static void main (String [] args)
{
    int selnum[]= {15,33,41,57,65,78,2,4,52};
    selectionSort(selnum,0,8);
    print(selnum);
    System.out.println();
    int innum[]= {37,25 ,43, 65, 48 ,84 ,73, 18 ,79, 56, 69, 32};
    InsertionSort(innum,0,11);
    print(innum);
    mergeSort(innum,0,11);
    print(innum);
    
}
 public static void print(int[] num) {
        for (int j = 0; j < num.length; j++) {
            System.out.printf("%d ", num[j]);
        }
        System.out.printf("\n");
    }

public static void selectionSort(int num[], int lo, int hi)
{
    for(int j=lo; j<hi;j++)
    {
        int s = getSmallest(num,j,hi);
        swap(num,j,s);
    }
}
public static int getSmallest(int [] list, int lo, int hi)
{
    int small = lo;
    for(int j =lo+1;j<=hi;j++)
    
        if(list[j]<list[small])small=j;
        return small;
    } //end getSmallest

public static void swap(int [] list, int i, int j)
{
//swap elements list[i] and list[j]
    int hold = list[i];
    list[i]=list[j];
    list[j]= hold;
}
public static void InsertionSort(int list[], int lo, int hi)
{
    //sort list[lo] to list[hi] in ascending order
    int j,k,key;
    for(j=lo+1;j<=hi;j++)
    {
        key = list[j];
        k=j-1 ;//starting comparing with previous item
        while(k>=lo && key<list[k]){
            list[k+1]= list[k];
            --k;
        }
        list[k+1]=key;
    }
}

public static void mergeSort(int []A, int lo, int hi){
    if(lo<hi){ // list contains at least 2 selements
        int mid = (lo + hi)/2; // get the midpoint subscript
        mergeSort (A, lo, mid); // sort the first half
        mergeSort(A,mid+1,hi); // sort second half
        merge(A, lo,mid,hi); // merge sorted halves
    }
}
public static void merge(int [] A, int lo, int mid, int hi){
    //A[lo...mid] and A[mid+1..hi] are sorted
    //merge the pieces so that A[lo...hi] are sorted
    int []T = new int [hi-lo +1];
    int i = lo;
    int j=mid+1;
    int k=0;
    while(i<=mid || j<=hi){
        if(i>mid) T[k++]=A[j++]; // A[lo...mid] completely processed.
        else if (j>hi) T[k++]=A[i++]; //A[mid+1..hi] are completely processed.
        else if (A[i]<A[j])  T[k++]=A[i++]; // niether part completed.
        else T[k++]=A[j++];
    }
    for(j=0;j<hi-lo+1;j++) A[lo+j]=T[j];
}// end merge
}