class Solution {
    public int solution(int balls, int share) {
        long answer = 1;
        
        long[] n = new long[balls - share];
        long[] m = new long[balls - share];
        for (int i=1; i<=n.length; i++) {
            n[i-1] = share + i;
            m[i-1] = i;
        }
        
        for (int i=0; i<n.length; i++) {
            answer *= n[i];
            answer /= m[i];
        }
        
        return (int) answer;
    }
}
