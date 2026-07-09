package Level_01;

public class Test_01_LinearSearch {
    public static int searchValue(int[] arr, int target){
        for (int i=0; i< arr.length; i++){
            if(arr[i]==target) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1,50,3,7,2,32,88,13};
        int target=100;
        int index = searchValue(arr,target);
        if (index!= -1) System.out.println("Target Value Index is : "+index);
        else System.out.println("Index not found for your target");


    }
}
