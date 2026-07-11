package Level_01;
/*
# Bubble Sort?
The largest element moves to the end after every pass.
Just like an air bubble rises to the top of water, the largest number "bubbles" to the end.

# Algorithm :
Start from the first element.
Compare it with the next element.
If the left element is greater than the right element, swap them.
Move one step forward and repeat.
After one complete pass, the largest element is in the correct position.
Repeat the process for the remaining unsorted elements.
Stop when the array is sorted.
*/

public class Test_04_BubbleSort {
    static void bubbleShort(int []arr){
        int n = arr.length;

        for(int i=0; i<n;i++){
           // boolean changed = false;  // Optional for optimization
            for(int j = 0;j<n-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                 //  changed = true;
                }
            }
           // if (!changed) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,11,7,45,33,5,25};

        System.out.println("Before Shorting : ");
        for(int e:arr) System.out.print(e+" ,");

        bubbleShort(arr);

        System.out.println("\nAfter Shorting : ");
        for(int e:arr) System.out.print(e+" ,");
    }
}
