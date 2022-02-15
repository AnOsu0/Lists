package example1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    private static ArrayList<Integer> list = new ArrayList<>();

    public static void addNumbers(){
        try {
            makeList();
            if (list.isEmpty()){
                System.out.println("Nie dodano liczb");
            } else
            {
                System.out.println(makeString(list));
            }
        } catch (NumberFormatException e){
            System.err.println("Niełaściwy format danych");
        }
    }

    private static void makeList() {
        String options = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę lub wpisz \"exit\"");
        options = sc.nextLine();
        if (!options.equals("exit")) {
            list.add(Integer.parseInt(options));
            makeList();
        }
    }

    private static Integer sum(List<Integer> list) {
        Integer sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }

    private static String makeString(List<Integer> list) {
        StringBuilder builder = new StringBuilder();
        for (Integer integer : list) {
            builder.append(integer);
            builder.append("+");
        }
         builder.replace(builder.length()-1,builder.length(),"=");
        builder.append(sum(list));
        return builder.toString();
    }

}
