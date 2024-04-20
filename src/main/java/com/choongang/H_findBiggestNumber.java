package com.choongang;
import java.util.*;

public class H_findBiggestNumber {
    public Integer findBiggestNumber(int[] arr) {
        // 배열의 길이가 0인 경우 null을 리턴합니다.
        if (arr.length == 0) {
            return null;
        }
        return Arrays.stream(arr)
                .max() // 배열의 요소 중 최댓값을 구합니다.
                .getAsInt();
    }
}
