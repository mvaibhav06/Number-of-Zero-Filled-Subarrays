public class ZeroFilledArrays {
    public static long zeroFilledSubarray(int[] nums) {
        long out = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                long count = 1;
                int j = 0;
                for(j=i+1; j<nums.length; j++){
                    if(nums[j]==0){
                        count++;
                    }else{
                        break;
                    }
                }
                out += ((count)*(count+1))/2;
                i = j;
            }
        }
        return out;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,0,0,2,0,0,4};
        System.out.println(zeroFilledSubarray(nums));
    }
}
