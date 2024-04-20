package com.choongang;
import java.util.*;
import java.util.stream.*;

public class C_filterOddNumbers {
    public List<Integer> filterOddNumbers(List<Integer> list) {
        return list.stream()
                .filter(e -> e % 2 == 0) // 각 요소를 순회하며 짝수인지 검사합니다.
                .collect(Collectors.toList()); // 최종적으로 리스트의 형태로 만듭니다.
    }
}
