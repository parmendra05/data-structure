package Level_01;
/*
# InsertionSort
Assume first element is sorted
Pick next element (key)
Compare with left elements
Shift bigger elements right
Insert key in the empty position
Repeat until array is sorted

# Visual example:
Array: 5, 2, 4, 6, 1, 3
Step 1: [5, 2, 4, 6, 1, 3]  → key = 2, compare with 5 → shift 5 → insert 2
Step 2: [2, 5, 4, 6, 1, 3]  → key = 4, compare with 5 → shift 5 → insert 4
Step 3: [2, 4, 5, 6, 1, 3]  → key = 6, already in place
Step 4: [2, 4, 5, 6, 1, 3]  → key = 1, shift 6,5,4,2 → insert 1
Step 5: [1, 2, 4, 5, 6, 3]  → key = 3, shift 6,5,4 → insert 3
Final:  [1, 2, 3, 4, 5, 6]
*/
public class Test_06_InsertionSort {

    static void insertionSort(int[] arr){

        for(int i =1; i< arr.length; i++){
            int key = arr[i];  // need to shift next value, assume 1st element present on correct position.
            int j = i-1;

            // Move elements greater than key one position ahead
            while (j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            // Place the key in its correct position
            arr[j+1]=key;
        }

    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 1, 3};

        System.out.println("Before Shorting : ");
        for(int e:arr) System.out.print(e+" ,");

        insertionSort(arr);

        System.out.println("\nAfter Shorting : ");
        for(int e:arr) System.out.print(e+" ,");
    }
}
