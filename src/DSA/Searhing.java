package DSA;

public class Searhing {


    public static void main(String[] args) {

        int nums[] = new int[10000];


        int target = 5000;
        int resultL =linearSerch(nums, target);
        int resultB =binarySearch(nums, target);
        int binaryRecursive = recursiveBinarySearch(nums, target, 0, nums.length -1);

        if(resultB != -1 && resultL != -1) {
            System.out.println(" Linear: Element find at index: " + resultL);
            System.out.println("Binary: Element find at index: " + resultB);
        }
        else
            System.out.println("Element was not found");

        if(binaryRecursive != -1 ) {
            System.out.println(" Recursive Binary search: Element find at index: " + binaryRecursive);

        }
        else
            System.out.println("Element in nums was not found");

    }

    public static int linearSerch(int[] nums, int target) {
        int steps =0;

        for(int i = 0; i<nums.length; i++){
            steps++;
            if(nums[i] == target){
                System.out.println("steps taken by Linear Search: " +steps);
                return i;
            }
        }
        System.out.println("steps taken by Linear Search: " +steps);
        return -1;
    }




    public static  int binarySearch(int[] nums, int target){
        int steps=0;
        int low = 0;
        int high =nums.length -1;

        while(low <= high){
            steps++;

            int mid = (low + high)/2;

            if(nums[mid] == target){
                System.out.println("steps taken by Binary Search: " +steps);
                return mid;
            }
            else if (nums[mid]<target) {
                low =mid + 1;

            }
            else {
                high = mid -1;

            }

        }
        System.out.println("steps taken by Binary Search: " +steps);
        return -1;
    }

    // recursive

    public static  int recursiveBinarySearch(int[] nums, int target, int low, int high){
        if(low<=high){
            int mid = (low +high)/2;

            if(nums[mid] == target){
                return mid;
            } else if (nums[mid] < target) {
                // new low is mid +1 and high of focus stays the same
                return recursiveBinarySearch(nums, target, mid +1, high);

            }
            else{
                // new high is mid - 1 because the target is the numbers in the left of mid
                recursiveBinarySearch(nums, target, low, mid -1);
            }

        }

        return -1;
    }
}
