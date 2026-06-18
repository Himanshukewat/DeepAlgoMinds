class Solution {
    //Brute Force
    public String decodeString(String s) {
        while(s.contains("]")){
            int r = s.indexOf(']');
            int l = -1;
            int balance = 1;
            for(int i=r-1; i>=0; i--){
                if(s.charAt(i) == ']') balance++;
                else if(s.charAt(i) == '[') balance--;
                
                if(balance == 0){
                    l = i;
                    break;
                }
            }

            String sub = s.substring(l+1,r);
            int start = l-1;
            while (start >= 0 && Character.isDigit(s.charAt(start))) {
                start--;
            }
            start++;
            int k = 0;
            for(int i=start; i<l; i++){
                k = k*10 + (s.charAt(i) - '0');
            }

            StringBuilder ans = new StringBuilder();
            for(int i=0; i<k; i++){
                ans.append(sub);
            }
            String left = s.substring(0, start);
            String right = s.substring(r + 1);
            s = left + ans.toString() + right;
        }
        return s;
    }
    // solved with stack
    public String decodeString(String s) {
        Stack<Integer> cntStack = new Stack<>();
        Stack<String> strStack = new Stack<>();

        String preStr  = "";
        int curr = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                curr = curr * 10 + (c - '0');
            } else if( c == '['){
                cntStack.push(curr);
                strStack.push(preStr);
                curr = 0;
                preStr = "";
            } else if(c == ']'){
                int repeat = cntStack.pop();
                String previous = strStack.pop();
                StringBuilder temp = new StringBuilder();
                for(int j = 0; j < repeat; j++){
                    temp.append(preStr);
                }

                preStr = previous + temp.toString();
            } else{
                preStr  += c;
            }
        }
        return preStr;
    }

}
