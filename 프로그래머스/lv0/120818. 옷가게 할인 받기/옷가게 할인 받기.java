class Solution {
    public int solution(int price) {
        int answer = 0;
        int p = 0;

        if(price >= 500000) {
            // p = (int) (price * 0.2);
            price = price * 8 / 10;
        } else if(price >= 300000) {
            // p = (int) (price * 0.1);
            price = price * 9 / 10;
        } else if(price >= 100000) {
            // p = (int) (price * 0.05);
            price = price * 95 / 100;
        }
        
        return price;
    }
}