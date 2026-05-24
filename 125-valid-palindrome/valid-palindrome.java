class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String str="";
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9'){
                str=str+ch;

            }
        }
        int l=0;
        int r=str.length()-1;
        
        while(l<r){
            if(str.charAt(l)==str.charAt(r)){
                //return true;
                l++;
                r--;
            }
            else{
                return false;
            }
        
        }
        return true;
        
        
    }
}