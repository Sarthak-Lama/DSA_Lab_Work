package Lab2;

import java.util.Arrays;

public class InsertionSort {

    public void insertionSort(int []arr){

        int size = arr.length, key,j;
        for (int i = 1; i < size   ; i++) {
            key = arr[i];
            j =i-1;
            while(j >= 0 && arr[j]> key)
            {
           arr[j+1]= arr[j];
                j--;

            }
            arr[j+1]= key;
            System.out.println("Movement : "+Arrays.toString(arr));
        }

    }
    public static void main(String[] args) {
        InsertionSort ob = new InsertionSort();
        int[] data = { 22, 9, 45, 1, 11, 16 };
        System.out.println("before insertion sort:" + Arrays.toString(data));
        ob.insertionSort(data);
        System.out.println("after insertion sort:" + Arrays.toString(data));

    }
}
