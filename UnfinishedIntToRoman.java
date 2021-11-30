class Solution {
    public String intToRoman(int num) {
        int countingNumber;
        int splitLength;
        String answer = "";
        String temp = Integer.toString(num);
        int[] numArr = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            numArr[i] = temp.charAt(i) - '0';
        }
        for (int i = 0; i < numArr.length; i++) {
            countingNumber = numArr[i];
            splitLength = numArr.slice(i, numArr.length-i).length;
            if (splitLength == 3) {
                countingNumber = countingNumber * 1000;
            } else if (splitLength == 2) {
                countingNumber = countingNumber * 100;
            } else if (splitLength == 1) {
                countingNumber = countingNumber * 10;
            }
            if (countingNumber % 1000 >= 1) {
                for (int i = 0; i < countingNumber/1000; i++) {
                    String += "M";
                }
            }
            if (countingNumber % 100 >= 1) {
                if (countingNumber >= 900) {
                    
                }
                else if (countingNumber % 500 == 1){
                    String += "D";
                }
            }            
        }
        return answer;
    }
}