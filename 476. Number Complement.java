class Solution {            // this solution is slow, could try to use a right shift(>>), but that would be playing with math
    public  int findComplement(int num) {
        int result=0;
        String temp=Integer.toBinaryString(num);
        
        String temp1=temp.replace('0', '2').replace('1', '0').replace('2', '1');
       
        
        
        result=Integer.parseInt(temp1,2);
        return result;
    }
}
