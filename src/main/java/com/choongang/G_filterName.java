package com.choongang;
import java.util.*;

public class G_filterName {
    public String[] filterName(List<String> names) {
        return names.stream()
                .distinct() //중복을 제거합니다.
                .filter(n -> n.startsWith("김")) // 첫 글자가 "김"인 경우만 필터링합니다.
                .sorted() // 정렬합니다.
                .toArray(String[]::new); // 최종 결과를 문자열 배열로 만듭니다.
    }
}
