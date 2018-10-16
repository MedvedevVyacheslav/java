package ru.bstu.iitus.vt41.mvv;

import java.util.Scanner;

public class superMarket extends House {
    private String name; // название супермаркета

    public superMarket() {
    }

    @Override
    public void init(Scanner scanner){
        System.out.println("Введите название. ");
        name = scanner.next();
        System.out.println("Введите количество этажей супермаркета. ");
        super.setCount(scanner.nextInt());
        System.out.println("Введите материал из которого сделан супермаркет. ");
        super.setMaterial(scanner.next());
        System.out.println("Введите площадь супермаркета. ");
        super.setArea(scanner.nextDouble());
        System.out.println("Введите срок эксплуатации. ");
        super.setExploitationPeriod(scanner.nextInt());
        System.out.println("Введите год создания супермаркета. ");
        super.setYear(scanner.nextInt());
        System.out.println("Введите высоту супермаркета. ");
        super.setHeight(scanner.nextInt());
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "название супермаркета " + getName() +
                "\nколичество этажей супермаркета " + super.getCount() +
                "\nматериал из которого сделан супермаркет " + super.getMaterial() +
                "\nплощадь супермаркета " + super.getArea() +
                "\nсрок эксплуатации " + super.getExploitationPeriod() +
                "\nгод создания супермаркета " + super.getYear() +
                "\nвысота супермаркета " + super.getHeight();
    }
}
