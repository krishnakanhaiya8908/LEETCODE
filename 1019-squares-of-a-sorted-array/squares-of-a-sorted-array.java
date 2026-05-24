class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] temp= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            temp[i]=nums[i]*nums[i];


        }
        //Arrays.sort(temp);
        //int[] temp= new int[nums.length];
        for(int i=0;i<temp.length-1;i++){
            for(int j=i+1;j<temp.length;j++){
                if(temp[i]>temp[j]){
                    int t=temp[i];
                    temp[i]=temp[j];
                    temp[j]=t;

                }
            }
        }
        return temp;
        
    }
}