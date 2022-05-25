class Solution {
    public int numberOfSteps(int num) {
        return numOfSteps(num,0);
    }
    public int numOfSteps(int num, int n) {
        if (num==0) return n;
        else if (num % 2 ==0) {num/=2;n++;}
        else {num--;n++;}
        return numOfSteps(num,n);
    }
}