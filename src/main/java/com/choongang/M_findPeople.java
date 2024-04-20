package com.choongang;
import java.util.*;
import java.util.stream.*;

public class M_findPeople {
    public List<String> findPeople(List<String> male, List<String> female, String lastName) {
        Stream<String> maleStream = male.stream(); // 남자 리스트 스트림을 만듭니다.
        Stream<String> femaleStream = female.stream(); // 여자 리스트 스트림을 만듭니다.

        Stream<String> stream = Stream.concat(maleStream, femaleStream); // 두 스트림을 합쳐 전체 인원을 대상으로 연산을 진행합니다.
        return stream.distinct() // 전체 인원에서 중복 이름을 제거합니다.
                .filter(person -> person.startsWith(lastName)) // 인자로 전달받은 성으로 시작하는 이름을 필터링합니다.
                .sorted() // 걸러진 이름들을 정렬합니다.
                .collect(Collectors.toList()); // 리스트의 형태로 최종 연산을 마칩니다.
    }
}
