package duplicate;
// My name: Eric Wang
//Team Members:
// Maria Fediakina
// Margarita Sergienko
// Isaac Guevarra
public class duplicateFinder {
    public int findDuplicate(int[] nums) {
        int duplicate = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if (nums[i] == nums[j]){
                    duplicate = nums[i];
                }
            }
        }
        return duplicate;
    }
}