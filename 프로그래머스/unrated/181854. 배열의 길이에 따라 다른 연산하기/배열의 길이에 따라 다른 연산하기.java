

class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];

        if (arr.length % 2 == 1) {
            for (int i = 0; i < arr.length; i++) {
                answer[i] += arr[i];
                if (i % 2 == 0) {
                    answer[i] = arr[i] + n;
                }
            }
        }
                if(arr.length % 2 == 0){
                    for (int j = 0; j < arr.length; j++) {
                        answer[j] += arr[j];
                        if (j % 2 == 1) {
                            answer[j] = arr[j] + n;
                        }

                }
            }
            return answer;
    }
}