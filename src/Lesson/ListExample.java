package Lesson;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Double> list1 = new ArrayList();
        List<Double> list2 = new LinkedList();
        for (int i = 0; i < 100; i++) {
            list1.add((double) i);
            list2.add((double) i);
        }

        printList(list1);
        printList(list2);
//        System.out.println(list.size());
//        list.remove(2);
//        list.remove(5.0);
//        System.out.println(list.size());
//        System.out.println(list);
    }

//    private static void printList (Collection col){ to moje sprawdzenie czy ogólniejszy typ działa
    private static void printList (List list){
        for (Object o: list) {
            System.out.println(o.toString());
        }
    }
}
