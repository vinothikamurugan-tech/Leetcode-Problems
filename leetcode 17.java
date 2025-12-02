class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return new ArrayList<>();
        }
        String[] s = {"", "", "abc" , "def" , "ghi" , "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new ArrayList<>();
        result.add("");

        for(char digit : digits.toCharArray()){
            List<String> temp = new ArrayList<>();
            String letters = s[digit - '0'];
        
            for (String a : result){
               for (char c : letters.toCharArray()){
                  temp.add(a + c);
                }
        }
        result = temp;
        }
        return result;
    }
}