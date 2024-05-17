package Lab2;

import java.util.Arrays;

public class ExchangeSort {
    public  void exchangeSort(int [] arr){
        int size = arr.length,temp;
        for (int i = 0; i <size- 1 ; i++) {
            for (int j = i+1; j < size; j++) {
                if (arr[i]> arr[j]){
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;


                }
                System.out.println("Movement : "+Arrays.toString(arr));
            }

        }
    }
    public static void main(String[] args) {
       ExchangeSort ob = new ExchangeSort();
        int[] data = { 22, 9, 45, 1, 11, 16 };
        System.out.println("before insertion sort:" + Arrays.toString(data));
        ob.exchangeSort(data);
        System.out.println("after insertion sort:" + Arrays.toString(data));

    }
}
