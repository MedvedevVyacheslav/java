package ru.bstu.iitus.vt41.mvv;

import java.util.Scanner;

public class multiHouse extends House{
    private Integer countApartment; // количество квартир

    public multiHouse(){
    }

    @Override
    public void init(Scanner scanner) {
        System.out.println("Введите количество квартир. ");
        countApartment= scanner.nextInt();
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

    public Integer getCountApartment() {
        return countApartment;
    }

    @Override
    public String toString() {
        return "количество квартир " + getCountApartment() +
                "\nколичество этажей дома " + super.getCount() +
                "\nматериал из которого сделан дом " + super.getMaterial() +
                "\nплощадь дома " + super.getArea() +
                "\nсрок эксплуатации " + super.getExploitationPeriod() +
                "\nгод создания дома " + super.getYear() +
                "\nвысота дома " + super.getHeight();
    }
}
