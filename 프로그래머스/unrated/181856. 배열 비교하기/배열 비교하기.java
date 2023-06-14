class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int sum1 = sumArray(arr1);
        int sum2 = sumArray(arr2);
        
        if (arr1.length != arr2.length) {
            return Integer.compare(arr1.length, arr2.length);
        }
        
        return Integer.compare(sum1, sum2);
    }
    
    private int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
