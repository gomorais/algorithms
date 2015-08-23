/**
 * quicksort solved for hackerrank
 * input:
 * 7
 * 1 3 9 8 2 7 5
 */

package quicksort;

import java.util.*;


public class Quicksort {
    
    public static void quicksort(int[] ar, int low, int high){
        if (low<high){
            int mid = partition(ar,low,high);
            quicksort(ar,low, mid-1);
            quicksort(ar,mid+1,high);
            printArray(ar);
        }
    }
    
    public static int partition(int[] ar, int low, int high){
        int pivot = ar[high];
        int i = low;
        int j = low;
        
        while(j<high && i<high){
            while(ar[i]<pivot && i<high){    
                i++;
            }
            while(ar[j]>pivot && j<high){
                j++;
            }
            if (i<j){
            	int temp = ar[j];
                ar[j] = ar[i];
                ar[i] = temp;
            } else{
            	j++;
            }
            
        }
        return i;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] numbers = new int[size];
        for (int i=0;i<size;i++){
            numbers[i] = in.nextInt();
        }
        quicksort(numbers, 0, size-1);
    }
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}