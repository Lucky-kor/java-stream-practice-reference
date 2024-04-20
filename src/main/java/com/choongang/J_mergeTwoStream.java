package com.choongang;
import java.util.*;
import java.util.stream.*;

public class J_mergeTwoStream {
    public List<String> mergeTwoStream(List<String> list1, List<String> list2) {
        Stream<String> stream1 = list1.stream(); // list1의 스트림을 생성합니다.
        Stream<String> stream2 = list2.stream(); // list2의 스트림을 생성합니다.

        Stream<String> stream3 = Stream.concat(stream1, stream2); // 두 개의 스트림을 합칩니다.
        return stream3.collect(Collectors.toList()); // 합쳐진 스트림을 List형태로 리턴합니다.
    }
}
