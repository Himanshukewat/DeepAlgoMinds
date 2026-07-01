class Solution {
    int cnt = 0;
    public int towerOfHanoi(int n, int from, int to, int aux) {
        // code here
        if(n==0){
            return cnt;
        }
        towerOfHanoi(n-1,from,aux,to);
        cnt +=1;
        towerOfHanoi(n - 1, aux, to, from);
        
        return cnt;
        
    }
}
