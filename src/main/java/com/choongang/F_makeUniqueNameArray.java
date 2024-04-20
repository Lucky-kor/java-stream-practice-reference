package com.choongang;
import java.util.*;

public class F_makeUniqueNameArray {
    public String[] makeUniqueNameArray(List<String> names) {
        return names.stream()
                .distinct() // 중복을 제거합니다.
                .sorted() // 정렬합니다.
                .toArray(String[]::new); // String 배열로 최종 연산을 진행합니다.
    }
}
