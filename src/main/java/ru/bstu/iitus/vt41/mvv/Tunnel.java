package ru.bstu.iitus.vt41.mvv;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@NoArgsConstructor
public class Tunnel extends Overpass {

    private Integer countPolos;

    @Override
    public void init(Scanner scanner){
        System.out.print("Введите количество полос движения. ");
        this.countPolos = scanner.nextInt();
        System.out.print("Введите протяженность [м]. ");
        super.setLength(scanner.nextDouble());
        System.out.print("Введите срок эксплуатации. ");
        super.setExploitationPeriod(scanner.nextInt());
        System.out.print("Введите год создания туннеля. ");
        super.setYear(scanner.nextInt());
        System.out.print("Введите высоту туннеля. ");
        super.setHeight(scanner.nextInt());
    }

    @Override
    public String toString() {
        return "оличество полос движения " + getCountPolos() +
                "\nпротяженность [м] " + super.getLength() +
                "\nсрок эксплуатации " + super.getExploitationPeriod() +
                "\nгод создания туннеля " + super.getYear() +
                "\nвысота туннеля " + super.getHeight();
    }
}
