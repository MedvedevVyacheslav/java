package ru.bstu.iitus.vt41.mvv;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество сооружений ");
        Construction[] constructions = new Construction[scanner.nextByte()];

        for (int i = 0; i < constructions.length; i++) {
            System.out.println("Кого создать?\n" +
                    "1) Супермаркет;\n" +
                    "2) Частный дом;\n" +
                    "3) Многоквартирный дом;\n" +
                    "4) Мост;\n" +
                    "5) Туннель.\n");
            int choice = scanner.nextInt();

            constructions[i] = createConstruction(choice);
            constructions[i].init(scanner);
        }

        System.out.println("Сооружение с минимальным сроком эксплуатации:\n " + searchMinExploitationPeriod(constructions).toString());
    }

    public static Construction createConstruction(int i){
        Construction construction = null;

        switch (i) {
            case 1:
                construction = new superMarket();
                break;
            case 2:
                construction = new privateHouse();
                break;
            case 3:
                construction = new multiHouse();
                break;
            case 4:
                construction = new Bridge();
                break;
            case 5:
                construction = new Tunnel();
                break;
        }

        return construction;
    }

    public static Construction searchMinExploitationPeriod(Construction[] constructions) {
        Integer minExploitationPeriod = constructions[0].getExploitationPeriod();
        int index = 0;

        for (int i = 1; i < constructions.length; i++) {
            if (constructions[i].getExploitationPeriod() < minExploitationPeriod) {
                minExploitationPeriod = constructions[i].getExploitationPeriod();
                index = i;
            }
        }

        return constructions[index];
    }
}
