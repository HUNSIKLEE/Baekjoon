class Solution {
    public int[] solution(int brown, int yellow) {
        
        for (int x = 1; ; x++) {
            
            int y = (brown / 2) - x + 2;
        
            if (x * y - brown == yellow) {
                
                return new int[]{y, x};
            }
        }
    }
}
