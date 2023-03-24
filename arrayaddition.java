class Arrayaddition {
    public int[] runningSum(int[] nums) {
		int j=0;
        int l = nums.length;
       
        int[] finalAr;

		finalAr= new int[l];
		for (int i=0;i<nums.length;i++) {
			j=nums[i]+j;
			finalAr[i]=j;
			
			
		 }
		 return finalAr;
			}
        }   
    