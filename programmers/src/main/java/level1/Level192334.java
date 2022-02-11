package level1;

import java.util.*;

public class Level192334 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, Integer> index = new HashMap<>();

        Map<String, Set<String>> reportList = new HashMap<>();

        // 초기화
        for (String id : id_list) {
            index.put(id, 0);
            reportList.put(id, new HashSet<>());
        }

        for (String s : report) {
            String[] str = s.split(" ");
            String to = str[0], from = str[1];
            Set<String> reportIds = reportList.get(to);
            if (!reportIds.contains(from)) {
                reportIds.add(from);
                index.put(from, index.get(from) + 1);
            }
        }

        // INDEX 돌면서 새로 k 이상인 애들 list로 생성
//        for (String s : report) {
//            String[] str = s.split(" ");
//            String to = str[0], from = str[1];
//            if(index.get(from) < k) reportList.get(to).remove(from);
//        }

        List<String> list = new ArrayList<>();

        for(String s : id_list) {
            if(index.get(s) >= k) {
                list.add(s);
            }
        }


        for(int i = 0; i < id_list.length; i++) {
//            answer[i] = reportList.get(id_list[i]).size();
            String user = id_list[i];
            Set<String> tmp = reportList.get(user);
            for(String s : list) {
                if(tmp.contains(s)) {
                    answer[i]++;
                }
            }
        }

        return answer;
    }
}
