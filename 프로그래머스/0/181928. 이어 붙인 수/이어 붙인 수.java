class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
         StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        
        
        for(int i=0;i<num_list.length;i++){
            
            if(num_list[i]%2!=0){
                odd.append(num_list[i]);
            }else{
                even.append(num_list[i]);
            }
        }
        
         int oddNumber = odd.length() > 0 ? Integer.parseInt(odd.toString()) : 0;
        int evenNumber = even.length() > 0 ? Integer.parseInt(even.toString()) : 0;
        
        answer = oddNumber + evenNumber;
        
        return answer;
    }
}