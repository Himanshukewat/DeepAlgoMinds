class Solution {
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
}
