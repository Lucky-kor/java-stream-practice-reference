package com.choongang;
import java.util.*;

public class B_computeAverageOfNumbers {
    public double computeAverageOfNumbers(List<Integer> list) {
        // list의 크기가 0인 경우 0을 리턴합니다.
        if (list.size() == 0) {
            return 0;
        }
        // 인자로 전달받은 list의 총합을 구합니다.
        double sum = list.stream()
                .mapToDouble(m -> m) // 평균이 소수점 이하 자리 값까지 구할 수 있도록 DoubleStream으로 변환합니다.
                .sum();
        // list의 크기로 나눕니다.
        return sum / list.size();
    }

//    다른 풀이법
//    public double computeAverageOfNumbers(List<Integer> list) {
//        return list.stream()
//                .mapToDouble(d -> d)
//                .average()
//                .orElse(0.0);
//    }
}
