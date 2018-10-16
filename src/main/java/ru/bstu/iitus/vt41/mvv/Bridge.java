package ru.bstu.iitus.vt41.mvv;

import java.util.Scanner;

public class Bridge extends Overpass {
    private Double maxLoad; //максимальная нагрузка

    public Bridge(){
    }

    @Override
    public void init(Scanner scanner){
        System.out.println("Введите максимальную нагрузку [тонн]. ");
        maxLoad = scanner.nextDouble();
        System.out.println("Введите протяженность [м]. ");
        super.setLenght(scanner.nextDouble());
        System.out.println("Введите срок эксплуатации. ");
        super.setExploitationPeriod(scanner.nextInt());
        System.out.println("Введите год создания моста. ");
        super.setYear(scanner.nextInt());
        System.out.println("Введите высоту моста. ");
        super.setHeight(scanner.nextInt());
    }

    public Double getMaxLoad() {
        return maxLoad;
    }

    @Override
    public String toString() {
        return "максимальную нагрузку [тонн] " + getMaxLoad() +
                "\nпротяженность [м] " + super.getLenght() +
                "\nсрок эксплуатации " + super.getExploitationPeriod() +
                "\nгод создания моста " + super.getYear() +
                "\nвысота моста " + super.getHeight();
    }
}
