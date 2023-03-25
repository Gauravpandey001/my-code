class PivotIndex {
    public int pivotIndex(int[] nums) 
    {   int p=0;
        int i=0;
        int total = 0;
        int k=0;
        int l= nums.length;
         for (int j = i+1; j < l; j++) {
                p = p + nums[j];

    }
    if (p==0) {return 0;
        
    }
        for (i=0;i<l-1 ;i++ ) {
            k= k+ nums[i];

            for (int g = i+2; g < l; g++) {
            total += nums[g];

        }
            if (total==k) {
            return i+1;

        }
        total=0;
    }
        return -1;
    }

}