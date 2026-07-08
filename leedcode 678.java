class Solution {
    public boolean checkValidString(String s) {

        int open =0;
        int close=0;
        char arr[] = s.toCharArray();
        for(char each:arr){
            if(each == '('){
                open++;
                close++;
                
            }
            else if(each == ')'){
                if(open>0){
                    open--;
                }
                close--;
            }
            else{
                if(open>0){
                    open--;
                }
                close++;
            }
            if(close<0){
                return false;
            }
        }
        return open==0;
    }
}