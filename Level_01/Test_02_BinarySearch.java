package Level_01;
/*
Instead of checking every element one by one, Binary Search repeatedly divides the search space into half.
In each step, it compares the target value with the middle element. If they are equal, the search ends.
Otherwise, it continues searching in either the left half or the right half.
 */
public class Test_02_BinarySearch {
    static int searchValue(int[] arr, int target){
        int minValue =0;
        int maxValue = arr.length -1;

        while (minValue <= maxValue){
            int midValue = (maxValue + minValue)/2;

            if (arr[midValue]==target) return midValue;

            else if (arr[midValue]<target) {
                minValue=midValue+1;
            }
            else maxValue=midValue-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int target = 60;
        int targetIndex=searchValue(arr,target);
        System.out.println("Target Value index is : "+targetIndex);
    }
}
