package ru.bstu.iitus.vt41.mvv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static ru.bstu.iitus.vt41.mvv.TypeConstructionEnum.showAllTypeConstructionEnum;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Construction> constructions = new ArrayList<Construction>();
        System.out.print("Введите количество сооружений ");
        int count = scanner.nextByte();
        int choice;
        for (int i = 0; i < count; i++) {
            do {
                System.out.println("Что создать?\n" + showAllTypeConstructionEnum());
                choice = scanner.nextInt();
            } while (choice < 1 || choice > TypeConstructionEnum.values().length);

            constructions.add(createConstruction(TypeConstructionEnum.from(choice)));
            constructions.get(i).init(scanner);
        }

        System.out.println("Сооружение с минимальным сроком эксплуатации:\n " + searchMinExploitationPeriod(constructions).toString());
    }

    public static Construction createConstruction(TypeConstructionEnum constructionEnum){
        Construction construction = null;

        switch (constructionEnum) {
            case SUPERMARKET:
                construction = new SuperMarket();
                break;
            case PRIVATEHOUSE:
                construction = new PrivateHouse();
                break;
            case MULTIHOUSE:
                construction = new MultiHouse();
                break;
            case BRIDGE:
                construction = new Bridge();
                break;
            case TUNNEL:
                construction = new Tunnel();
                break;
        }

        return construction;
    }

    public static Construction searchMinExploitationPeriod(List<Construction> constructions) {
        Integer minExploitationPeriod = constructions.get(0).getExploitationPeriod();
        int index = 0;
        int i = 1;
        for (Construction tmpConstructions : constructions) {
            if (tmpConstructions.getExploitationPeriod() < minExploitationPeriod) {
                minExploitationPeriod = tmpConstructions.getExploitationPeriod();
                index = i;
                i++;
            }
        }

        return constructions.get(index);
    }
}
