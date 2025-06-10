package DSA;

public class BubbleSorte {
    public static void main(String[] args) {
        int nums[] = {6,5,2,8,4,9,4};
        int size = nums.length;
        int temp = 0;
        System.out.println("Before sorting");
        for(int num: nums){
            System.out.print(num + " ");
        }

        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(nums[j] >nums[j+1]){
                    temp=nums[j];
                    nums[j+1]=temp;


                }

            }
        }


        System.out.println("\nAfter sorting");
        for(int num: nums){
            System.out.print(num + " ");
        }
    }
}
