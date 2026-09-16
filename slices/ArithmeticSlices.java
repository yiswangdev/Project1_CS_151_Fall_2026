package slices;
//Team Members:
// Eric Wang
// Maria Fediakina
// Margarita Sergienko
// Isaac Guevarra
// https://leetcode.com/problems/arithmetic-slices/description/
public class ArithmeticSlices{
    public int numberOfArithmeticSlices(int[] nums) {
        int seqLength;
        int difference = 0;
        int result = 0;
        for(int i = 0; i <= nums.length-3; i++){
            seqLength = 1;
            if(i+1 < nums.length){
                difference = nums[i] - nums[i+1];
            }
            while(i+seqLength < nums.length && nums[i+seqLength-1] - nums[i+seqLength] == difference){
                seqLength++;
                if(seqLength >= 3){
                    result++;
                }
            }
        }
        return result;
    }
}