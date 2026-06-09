public class TrapWater {
    public int trap(int[] height) {
        int n = height.length;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        //left max ==> left to right
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
            // 1 1 2 2 2 2 2 3 3 3 3 1
        }
        //right max ==> right to left 
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
            // 3 3 3 3 3 3 2 2 1 1 
        }

        int trapWater = 0;
        for(int i=0; i<n; i++){
            int waterLevel = Math.min(leftMax[i],rightMax[i]); 
            trapWater += waterLevel - height[i];
        }

        return trapWater;

    }
}
