package ru.bstu.iitus.vt41.mvv;

import java.util.Scanner;

public class privateHouse extends House{
    private Integer countRoom; // количество комнат

    public privateHouse() {
    }

    @Override
    public void init(Scanner scanner) {
        System.out.println("Введите количество комнат. ");
        countRoom = scanner.nextInt();
        System.out.println("Введите количество этажей дома ");
        super.setCount(scanner.nextInt());
        System.out.println("Введите материал из которого сделан дом. ");
        super.setMaterial(scanner.next());
        System.out.println("Введите площадь дома. ");
        super.setArea(scanner.nextDouble());
        System.out.println("Введите срок эксплуатации. ");
        super.setExploitationPeriod(scanner.nextInt());
        System.out.println("Введите год создания дома. ");
        super.setYear(scanner.nextInt());
        System.out.println("Введите высоту дома. ");
        super.setHeight(scanner.nextInt());
    }

    public Integer getCountRoom() {
        return countRoom;
    }

    @Override
    public String toString() {
        return "количество комнат " + getCountRoom() +
                "\nколичество этажей дома " + super.getCount() +
                "\nматериал из которого сделан дом " + super.getMaterial() +
                "\nплощадь дома " + super.getArea() +
                "\nсрок эксплуатации " + super.getExploitationPeriod() +
                "\nгод создания дома " + super.getYear() +
                "\nвысота дома " + super.getHeight();
    }
}
