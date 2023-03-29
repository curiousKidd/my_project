package my.project.demo.stream;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Apple {
    private String city;
    private int weight;
    private Color color;
    private int price;
    private Ingredient ingredient;
}

@AllArgsConstructor
@Getter
@ToString
class Ingredient {
    private Boolean sugar;
    private Boolean poison;
    private int sugarPersent;
}

enum Color {
    RED, GREEN, DARK;
}
