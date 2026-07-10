package Level_01;

public class Test_03_BinarySearchRecursion {
    static int binarySearch(int[] arr, int low, int high, int target){

        if(low > high) return -1;

        int mid = (low + high)/2;

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
