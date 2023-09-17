package my.project.demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {

    public static void main(String[] args) {
        replaceTest();
    }

    public static void replaceTest() {
        String s = "t0s0q99d7d7fg90a";
        int i = Integer.parseInt(s.replaceAll("[a-zA-Z]", ""));

        System.out.println("s = " + s.replaceAll("[a-zA-Z]", ""));
        System.out.println("i = " + i);
    }

    public static void localDateTest() {
        String a = "2023.06.08 13:07:15";
        String b = "2023.06.08 13:08:20";

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");

        System.out.println(LocalDateTime.parse(b, dateTimeFormatter).isAfter(LocalDateTime.parse(a, dateTimeFormatter)));
    }
}
