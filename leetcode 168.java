class Solution {
    public String convertToTitle(int columnNumber) {
          StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // Adjust because A = 1 not 0
            int remainder = columnNumber % 26;
            char ch = (char)(remainder + 'A');
            result.append(ch);
            columnNumber /= 26;
        }

        return result.reverse().toString();
    }
}