package com.choongang;
import java.util.*;

public class A_computeSumOfAllElements {
    public int computeSumOfAllElements(List<Integer> list) {

        return list.stream()
                .mapToInt(m -> m)// 스트림을 IntStream으로 변환합니다.
                .sum(); // 최종 연산으로 총 합을 구합니다.
    }
}
