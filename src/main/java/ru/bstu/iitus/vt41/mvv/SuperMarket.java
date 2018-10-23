package ru.bstu.iitus.vt41.mvv;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@NoArgsConstructor
public class SuperMarket extends House {

    private String name;

    @Override
    public void init(Scanner scanner){
        System.out.print("Введите название. ");
        this.name = scanner.next();
        System.out.print("Введите количество этажей супермаркета. ");
        super.setCount(scanner.nextInt());
        System.out.print("Введите материал из которого сделан супермаркет. ");
        super.setMaterial(scanner.next());
        System.out.print("Введите площадь супермаркета. ");
        super.setArea(scanner.nextDouble());
        System.out.print("Введите срок эксплуатации. ");
        super.setExploitationPeriod(scanner.nextInt());
        System.out.print("Введите год создания супермаркета. ");
        super.setYear(scanner.nextInt());
        System.out.print("Введите высоту супермаркета. ");
        super.setHeight(scanner.nextInt());
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
