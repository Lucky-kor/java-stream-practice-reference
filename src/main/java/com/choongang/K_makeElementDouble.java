package com.choongang;
import java.util.*;
import java.util.stream.*;

public class K_makeElementDouble {
    public List<Integer> makeElementDouble(List<Integer> list) {
        return list.stream()
                .map(element -> element * 2) // map을 이용해서 각 요소의 값을 수정합니다.
                .collect(Collectors.toList()); // 리스트의 형태로 바꾼 후 리턴합니다.
    }
}
