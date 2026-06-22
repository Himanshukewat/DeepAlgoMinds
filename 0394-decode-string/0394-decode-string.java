class Solution {
    public String decodeString(String s) {
        Stack<Integer> digit = new Stack<>();
        Stack<String> ch = new Stack<>();
        String ans = "";
        int num = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                num = num * 10 + (c - '0');
            }
            else if(c == '['){
                digit.push(num);
                ch.push(ans);
                num = 0;
                ans = "";
            }
            else if(c == ']'){
                int repeat = digit.pop();
                String prev = ch.pop();
                String temp = "";
                for(int j = 0; j < repeat; j++){
                    temp += ans;
                } 
                ans = prev + temp;
            } 
            else{
                ans += c;
            }
        }
        return ans;
    }
}