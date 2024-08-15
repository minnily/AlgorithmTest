class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int idx = 0;
        
        for(int[] query: queries){
            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            int min=Integer.MAX_VALUE;
            boolean flag = false;
            
            for(int i=s; i<=e; i++){
                if(arr[i]>k && arr[i]<min){
                    min=arr[i];
                    flag=true;
                }
            }
            if(flag){
                answer[idx]=min;
            }else{
                answer[idx]=-1;
            }
            idx++;
        }
        
        return answer;
    }
}