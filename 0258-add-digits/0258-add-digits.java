class Solution {
    public int addDigits(int num) {
        if(num<10){
            return num;
        }
        int sum=0;
        while(num>=10){
            int dig=num%10;
            sum+=dig;
            num=num/10;
            if(num<10){
                sum+=num;
                num=sum;
                sum=0;
            }
        }
        return num;
        
    }
}