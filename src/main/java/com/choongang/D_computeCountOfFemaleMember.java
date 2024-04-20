package com.choongang;
import java.util.*;

public class D_computeCountOfFemaleMember {
    public long computeCountOfFemaleMember(List<Member> members){
        long count = members.stream()
                .filter(m -> m.getGender().equals("Female")) // 각 회원의 성별을 받아와 성별이 여성인 멤버만 필터링합니다.
                .count(); // 필터로 걸러진 여성 멤버의 수를 구합니다.
        return count;
    }

    static class Member {
        String name;
        String gender;

        public Member(String name, String gender) {
            this.name = name;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }

    }
}
