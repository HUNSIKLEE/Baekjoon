class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = intArrayOf()
        var arrs = arr.toMutableList()
        
        arrs.remove(arrs.minOrNull())
        answer = arrs.toIntArray()
        
        if(arrs.size == 0) answer = intArrayOf(-1)
        return answer
    }
}