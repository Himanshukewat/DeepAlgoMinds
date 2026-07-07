class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>(); 
        int maxArea = 0;
        int n = heights.length;
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
                int currHeight = heights[stack.pop()];
                int leftSmaller = stack.isEmpty() ? -1 : stack.peek();
                int rightSmaller = i;
                int width = rightSmaller - leftSmaller - 1;
                int area = currHeight * width;
                maxArea = Math.max(maxArea, area);
            }

            stack.push(i);
        }

        while (!stack.isEmpty()) {

            int currHeight = heights[stack.pop()];

            int leftSmaller = stack.isEmpty() ? -1 : stack.peek();
            int rightSmaller = n;

            int width = rightSmaller - leftSmaller - 1;
            int area = currHeight * width;

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}
