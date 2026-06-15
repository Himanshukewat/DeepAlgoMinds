public class CapacityShip {
    public int shipWithinDays(int[] weights, int days) {
        int low = maxArr(weights);
        int high = sumArr(weights);
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(canShipPass(weights,mid,days)){
                ans = mid;
                high = mid - 1;
            } else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public int sumArr(int weights[]){
        int sum = 0;
        for(int weight : weights){
            sum += weight;
        }
        return sum;
    }

    public int maxArr(int weights[]){
        int max = Integer.MIN_VALUE;
        for(int weight : weights){
            if(weight > max){
                max  = weight;
            }
        }
        return max;
    }

    public boolean canShipPass(int weights[], int cap, int days){
        int dayCount = 1;
        int currWeight = 0;
        for(int i=0; i<weights.length; i++){
            if(currWeight + weights[i] <= cap){
                currWeight += weights[i];
            } else {
                dayCount++;
                currWeight = weights[i];
            }
        }

        return dayCount <= days;
    }
}
