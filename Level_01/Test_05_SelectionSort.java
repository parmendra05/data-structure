package Level_01;
/*
# Selection Sort: Find the minimum element and swap it into the correct position.

# Algorithm
Start from the first element.
Assume first element is the smallest.
Check all remaining elements.
Find the actual smallest element.
Swap it with the current position.
Move to the next position.
Repeat until the array is sorted.
*/
public class Test_05_SelectionSort {

    static void selectionSort(int[] arr){
        int lowIndex = 0;
        for (int i=0; i<arr.length; i++){

            for(int j=i; j< arr.length; j++){
                if(arr[j] < arr[lowIndex]) lowIndex = j;
            }
            if(lowIndex > 0){
                int temp = arr[i];
                arr[i] = arr[lowIndex];
                arr[lowIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,11,7,45,33,5,25};

        System.out.println("Before Shorting : ");
        for(int e:arr) System.out.print(e+" ,");

        selectionSort(arr);

        System.out.println("\nAfter Shorting : ");
        for(int e:arr) System.out.print(e+" ,");
    }
}
