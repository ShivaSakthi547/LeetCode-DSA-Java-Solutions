class Solution {
    public int searchInsert(int[] nums, int target) {
        int res=0;
        int low=0;
        int mid=0;
        int ans=0;
        int high=nums.length-1;
        while(low<=high){
            mid=low+(high-low)/2;
            if(nums[mid]==target){
                   res=1;
                   break;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
        }
        if(res==1){
            ans=mid;
        }
        else{
            for(int i=0;i<nums.length;i++){
                if(nums[i]>target){
                    ans=i;
                    break;
                }
                if(i==nums.length-1){
                    ans= nums.length ;
                }
            }
        }
        return ans;
    }
}
