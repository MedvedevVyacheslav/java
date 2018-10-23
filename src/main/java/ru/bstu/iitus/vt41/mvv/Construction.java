package ru.bstu.iitus.vt41.mvv;

import lombok.Data;

import java.util.Scanner;

@Data
public abstract class Construction {

    private Integer exploitationPeriod;
    private Integer year;
    private Integer height;

    public abstract void init(Scanner scanner);

}
