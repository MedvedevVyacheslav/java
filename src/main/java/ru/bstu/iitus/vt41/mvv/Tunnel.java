package ru.bstu.iitus.vt41.mvv;

import java.util.Scanner;

public class Tunnel extends Overpass {
    private Integer countPolos;

    public Tunnel(){
    }

    @Override
    public void init(Scanner scanner){
        System.out.println("Введите количество полос движения. ");
        countPolos = scanner.nextInt();
        System.out.println("Введите протяженность [м]. ");
        super.setLenght(scanner.nextDouble());
        System.out.println("Введите срок эксплуатации. ");
        super.setExploitationPeriod(scanner.nextInt());
        System.out.println("Введите год создания туннеля. ");
        super.setYear(scanner.nextInt());
        System.out.println("Введите высоту туннеля. ");
        super.setHeight(scanner.nextInt());
    }

    public Integer getCountPolos() {
        return countPolos;
    }

    @Override
    public String toString() {
        return "оличество полос движения " + getCountPolos() +
                "\nпротяженность [м] " + super.getLenght() +
                "\nсрок эксплуатации " + super.getExploitationPeriod() +
                "\nгод создания туннеля " + super.getYear() +
                "\nвысота туннеля " + super.getHeight();
    }
}
