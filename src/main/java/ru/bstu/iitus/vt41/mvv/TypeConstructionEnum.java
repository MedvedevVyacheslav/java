package ru.bstu.iitus.vt41.mvv;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TypeConstructionEnum {

    SUPERMARKET(1, "Супермаркет"),
    PRIVATEHOUSE(2, "Частный дом"),
    MULTIHOUSE(3, "Многоквартирный дом"),
    BRIDGE(4, "Мост"),
    TUNNEL(5, "Туннель");

    private int id;
    private String name;

    public static TypeConstructionEnum from(int number) {

        for (TypeConstructionEnum constructionEnum : TypeConstructionEnum.values()) {
            if (number == constructionEnum.getId())
                return constructionEnum;
        }
        throw new RuntimeException("по данному номеру не определен тип конструкции: " + number);
    }

    public static String showAllTypeConstructionEnum() {
        StringBuilder result = new StringBuilder();
        for (TypeConstructionEnum constructionEnum : TypeConstructionEnum.values()) {
            result.append(constructionEnum.id + ")" + constructionEnum.name + "\n");
        }
        return result.toString();
    }
}
