class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int negPov = 1;
        String ORDER = "MDCLXVI";
                
        String nstr= "";
        char ch;
       
        for (int i=0; i < s.length(); i++)
        {
            ch = s.charAt(i);
            nstr = ch+nstr;
        }
        
        for (int i = 0; i < nstr.length(); i++) {
            negPov = 1;
            if (i > 0 && (i + 1) <= nstr.length()) {
                if (nstr.charAt(i) != nstr.charAt(i - 1)) {
                    if (ORDER.indexOf(nstr.charAt(i)) > ORDER.indexOf(nstr.charAt(i - 1))) {
                        negPov = -1;
                    }
                }
            }
            if (nstr.charAt(i) == 'I') sum += negPov * 1;
            else if (nstr.charAt(i) == 'V') sum += negPov * 5;
            else if (nstr.charAt(i) == 'X') sum += negPov * 10;
            else if (nstr.charAt(i) == 'L') sum += negPov * 50;
            else if (nstr.charAt(i) == 'C') sum += negPov * 100;
            else if (nstr.charAt(i) == 'D') sum += negPov * 500;
            else if (nstr.charAt(i) == 'M') sum += negPov * 1000;
        }
        return sum;
    }
}