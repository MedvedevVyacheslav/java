package ru.bstu.iitus.vt41.mvv;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@NoArgsConstructor
public class PrivateHouse extends House{

    private Integer countRoom;

    @Override
    public void init(Scanner scanner) {
        System.out.print("Введите количество комнат. ");
        this.countRoom = scanner.nextInt();
        System.out.print("Введите количество этажей дома ");
        super.setCount(scanner.nextInt());
        System.out.print("Введите материал из которого сделан дом. ");
        super.setMaterial(scanner.next());
        System.out.print("Введите площадь дома. ");
        super.setArea(scanner.nextDouble());
        System.out.print("Введите срок эксплуатации. ");
        super.setExploitationPeriod(scanner.nextInt());
        System.out.print("Введите год создания дома. ");
        super.setYear(scanner.nextInt());
        System.out.print("Введите высоту дома. ");
        super.setHeight(scanner.nextInt());
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
