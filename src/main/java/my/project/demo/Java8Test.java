package my.project.demo;

import lombok.RequiredArgsConstructor;

import java.util.function.Predicate;
import java.util.function.Supplier;

@RequiredArgsConstructor
public class Java8Test {

    //Supplier

    //CompletableFuture

    public static void main(String[] args) {
        solution_2();
        solution_4();
    }

    static boolean compute(String str) {
        System.out.println("executing...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignore) {
        }
        return str.contains("a");
    }

    static String eagerMatch(boolean b1, boolean b2) {
        return b1 && b2 ? "match" : "incompatible!";
    }

    public static void solution_1() {
        boolean b1 = compute("Hello_1");
        boolean b2 = compute("Hello_2");
        eagerMatch(b1, b2);
    }

    public static void solution_2() {
        long startTime = System.currentTimeMillis();
        Supplier<Boolean> a = () -> compute("Hello_1");
        Supplier<Boolean> b = () -> compute("Hello_2");
        lazyMatch(a, b);
        long lTime = System.currentTimeMillis() - startTime;
        System.out.println("TIME_1 : " + lTime / 1000 + " (s)");
    }

    public static void solution_3() {
        String value = compute("Hello_1") && compute("Hello_2") ? "match" : "incompatible!";
    }

    static String lazyMatch(Supplier<Boolean> a, Supplier<Boolean> b) {
        return a.get() && b.get() ? "match" : "incompatible!";
    }

    public static void solution_4() {
        long startTime = System.currentTimeMillis();
        Predicate<String> a = (str) -> compute(str);
        Predicate<String> b = (str) -> true;
        lazyMatch_2(a, b);
        long lTime = System.currentTimeMillis() - startTime;
        System.out.println("TIME_2 : " + lTime / 1000 + " (s)");
    }

    static String lazyMatch_2(Predicate<String> a, Predicate<String> b) {
        return a.test("test") && b.test("test") ? "match" : "incompatible!";
    }

}
