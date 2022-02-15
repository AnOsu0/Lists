package example2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Numbers {

    public static void effect(){
        List<Integer> list = makeList();
        if (!list.isEmpty()){
           printLength(list);
           sum(list);
           mid(list);
        } else {
            System.out.println("Nie podano żadnej poprawnej wartości");
        }
    }


    private static void mid(List<Integer> list){
        double sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        double mid = sum/list.size();
        System.out.println("Średnia podanych liczb to: " + mid);
    }

    private static void sum(List<Integer> list){
            int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
            System.out.println("Suma podanych liczb to: " + sum);
    }

    private static void printLength(List list) {
            System.out.println("Ilość poprawnie podanych elementów to " + list.size());
    }

    private static List<Integer> makeList() {
        List<Integer> numbers = new ArrayList<>();
        fillList(numbers);
        return numbers;
    }

    private static void fillList(List<Integer> list) {
        int check = 5;
        while (check % 5 == 0 && check >= 0) {
            check = getNumber();
            if (check % 5 == 0 && check >= 0) {
                list.add(check);
            }
        }
    }

    private static int getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę nieujemną i podzieną przez 5");
        return sc.nextInt();
    }
}
