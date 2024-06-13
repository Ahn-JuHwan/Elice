package JAVA1.ThirdWeek.SelfStudy.Tuesday.Waitfor;

import java.util.Comparator;

public class MyComparator implements Comparator<Member> {
    @Override
    public int compare(Member o1, Member o2) {

        //같은 id를 가진 멤버들 중에서는, 나이가 높은 멤버가 앞
        if(o1.getId() == o2.getId()){
            return o2.getAge() - o1.getAge();
        }
        return o1.getId() - o2.getId();
    }
}
