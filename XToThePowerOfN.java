class Solution {
    public double myPow(double x, int n) {
        double answer = x;
        if (n == 0 || x == 1) {
            answer = 1;
        } else if (x == -1) {
            if (n%2 == 0) {
                answer = 1;
            } else {
                answer = -1;
            }
        } else if (n < 0) {
            for (int i = 0; i < n*-1 + 2; i++) {
                if (i == 0) {
                    answer = x;
                } else {
                    answer = answer / x;
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    answer = x;
                } else {
                    answer = answer * x;
                }
            }  
        }
        return answer;
    }
}