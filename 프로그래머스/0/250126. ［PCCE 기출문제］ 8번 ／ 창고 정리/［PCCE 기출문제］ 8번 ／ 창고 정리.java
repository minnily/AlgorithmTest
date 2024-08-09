class Solution {
    public String solution(String[] storage, int[] num) {
        //1. 변수 선언 및 초기화
        int num_item = 0; // 정리된 창고에서의 물건 개수를 추적하는 변수
        String[] clean_storage = new String[storage.length]; // 정리된 창고의 물건 이름을 저장하는 배열
        int[] clean_num = new int[num.length]; // 정리된 창고의 물건 개수를 저장하는 배열

        // 2.정리된 창고 만들기
        // for문 통해 각칸에 있는 물건 순회
        for(int i=0; i<storage.length; i++){
            int clean_idx = -1; // 현재 물건이 정리된 창고에 존재하는지 여부를 확인하는 변수
            for(int j=0; j<num_item; j++){
                // 만약 물건 이름과 정리된 창고에 있는 것의 이름이 같을 경우 j라고 인덱스 번호를 지정한다는 것
                if(storage[i].equals(clean_storage[j])){
                    clean_idx = j;
                    break;
                }
            }
            // 물건이 정리된 창고에 없는 경우 
            if(clean_idx == -1){
                //정리된 스토리지에 새롭게 추가한다
                clean_storage[num_item] =  storage[i];
                clean_num[num_item] = num[i];
                num_item += 1;
            }
                // 물건이 정리된 창고에 있는 경우
            else{
                // 해당 물건의 개수를 더한다
                clean_num[clean_idx] += num[i];
            }
        }
        
        // 아래 코드에는 틀린 부분이 없습니다.

        // 3. 가장 많은 물건 찾기
        //  가장 많이 쌓인 물건의 개수 추적하는 변수
        int num_max = -1;
        String answer = "";
        // clean_num 배열을 순회하며 가장 큰 값을 찾고 그 값에 해당하는 물건의 이름을 answer에 저장
        for(int i=0; i<num_item; i++){
            if(clean_num[i] > num_max){
                num_max = clean_num[i];
                answer = clean_storage[i];
            }
        }
        // 가장많이 쌓인 물건의 이름 반환
        return answer;
    }
}
