package p1;

import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {


        System.out.println(solution("qewqevet", "vet"));


    }

    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);

    }
}