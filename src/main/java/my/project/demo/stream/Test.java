package my.project.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class Test {
    public static void main(String[] args) {
        Ingredient ingredient = new Ingredient(true, true, 30);
        Ingredient ingredient2 = new Ingredient(false, true, 40);
        Ingredient ingredient3 = new Ingredient(true, false, 30);
        Ingredient ingredient4 = new Ingredient(false, true, 50);
        Ingredient ingredient5 = new Ingredient(true, true, 40);

        List<Apple> apples = Arrays.asList(
                new Apple("서울", 20, Color.DARK, 2000, ingredient),
                new Apple("서울", 25, Color.GREEN, 2300, ingredient2),
                new Apple("서울", 27, Color.DARK, 2150, ingredient4),
                new Apple("서울", 30, Color.GREEN, 2200, ingredient3),
                new Apple("서울", 26, Color.RED, 2800, ingredient2),
                new Apple("서울", 35, Color.GREEN, 2600, ingredient),
                new Apple("서울", 33, Color.RED, 2500, ingredient4),
                new Apple("서울", 23, Color.DARK, 2300, ingredient5),
                new Apple("서울", 31, Color.RED, 2200, ingredient5),
                new Apple("대구", 25, Color.GREEN, 2300, ingredient3),
                new Apple("대구", 22, Color.DARK, 2800, ingredient2),
                new Apple("대구", 23, Color.RED, 2700, ingredient),
                new Apple("대구", 25, Color.DARK, 2500, ingredient),
                new Apple("대구", 35, Color.RED, 2200, ingredient),
                new Apple("대구", 38, Color.DARK, 2100, ingredient)
        );

        // 2. 사과중에서 성분이 설탕이 들어가있는 애들 중에서 사과의색상을 중복없이 표시
        apples.stream()
                .filter(f -> f.getIngredient().getSugar())
                .map(Apple::getColor)
                .distinct()
                .forEach(System.out::println);

        System.out.println("==1==========================================");

        // 서울 사과중에서 가격이 2500원 이상이고 무게가 25이하인것 중에
        // sugar퍼센트, 프라이스로 오름차순
        System.out.println(
                apples.stream()
                        .filter(f -> f.getCity().equals("서울") && f.getPrice() >= 2500 && f.getWeight() <= 25)
                        .sorted(comparing((Function<Apple, Integer>) apple -> apple.getIngredient().getSugarPersent())
                                .thenComparing(comparing(Apple::getPrice)))
                        .collect(Collectors.toList())
        );

        System.out.println("==============================2222==============");

        // 성분이 40이상인것중에 사과가 그린인것들중에  가격이 가장 높은건 하나-
        Optional<Apple> first = apples.stream()
                .filter(f -> f.getIngredient().getSugarPersent() >= 40 && f.getColor() == Color.GREEN)
                .sorted(comparing(Apple::getPrice).reversed())
                .findFirst();

        System.out.println(first.get());

        Apple apple = apples.stream()
                .filter(f -> f.getIngredient().getSugarPersent() >= 40 && f.getColor() == Color.GREEN)
                .max(comparing(Apple::getPrice))
                .get();

        System.out.println(apple);
    }

}
