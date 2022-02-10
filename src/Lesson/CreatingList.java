package Lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CreatingList {
    public static void main(String[] args) {
//        Integer[] ints = {5,10,15};
//        List<Integer> list = Arrays.asList(ints);
//        List<Integer> list1 = List.of(3,4,5);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(20);
        list.add(4);
        System.out.println(list);
        numberComparator comparator = new numberComparator();
        list.sort(comparator);
        System.out.println(list);
    }

    static class numberComparator implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            return o1.compareTo(o2);
        }
    }
}
