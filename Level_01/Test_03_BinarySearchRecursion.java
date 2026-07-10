package Level_01;
/*
Common interview question is:
Why do we calculate the middle as  low + (high - low) / 2  instead of (low + high) / 2  .

✅ Both formulas calculate the same middle index.
✅ (low + high) / 2 can cause integer overflow. (int limit Maximum value: 2,147,483,647)
✅ low + (high - low) / 2 is overflow-safe.
✅ It is the recommended approach in Java and most programming languages.

Integer overflow occurs when a calculation exceeds the limit of the int data type, producing an incorrect result.
*/
public class Test_03_BinarySearchRecursion {
    static int binarySearch(int[] arr, int low, int high, int target){

        if(low > high) return -1;

        //int mid = (low + high)/2;
        int mid = low + ( high - low)/2;

        if(arr[mid] ==target) return mid;

        else if (arr[mid] < target) return binarySearch(arr,mid+1,high,target);
        else return binarySearch(arr,low,mid-1,target);
    }

    public static void main(String[] args) {
        int[] arr= {10,13,25,31,33,45,97,299};
        int target = 85;
        int result = binarySearch(arr,0,arr.length-1,target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
