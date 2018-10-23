package ru.bstu.iitus.vt41.mvv;
import java.util.Scanner;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Bridge extends Overpass {

    private Double maxLoad;

    @Override
    public void init(Scanner scanner){
        System.out.print("Введите максимальную нагрузку [тонн]. ");
        this.maxLoad = scanner.nextDouble();
        System.out.print("Введите протяженность [м]. ");
        super.setLength(scanner.nextDouble());
        System.out.print("Введите срок эксплуатации. ");
        super.setExploitationPeriod(scanner.nextInt());
        System.out.print("Введите год создания моста. ");
        super.setYear(scanner.nextInt());
        System.out.print("Введите высоту моста. ");
        super.setHeight(scanner.nextInt());
    }

    @Override
    public String toString() {
        return "максимальную нагрузку [тонн] " + getMaxLoad() +
                "\nпротяженность [м] " + super.getLength() +
                "\nсрок эксплуатации " + super.getExploitationPeriod() +
                "\nгод создания моста " + super.getYear() +
                "\nвысота моста " + super.getHeight();
    }

}
