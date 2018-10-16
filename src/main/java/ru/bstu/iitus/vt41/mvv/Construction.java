package ru.bstu.iitus.vt41.mvv;

import java.util.Scanner;

public abstract class Construction {
    private Integer exploitationPeriod; //эксплуатационный период сооружения
    private Integer year; //год создания сооружения
    private Integer height; // высота сооружения

    public abstract void init(Scanner scanner);

    public Integer getExploitationPeriod(){
        return exploitationPeriod;
    }

    public Integer getYear(){
        return year;
    }

    public Integer getHeight(){
        return height;
    }

    public void setExploitationPeriod(Integer exploitationPeriod){
        this.exploitationPeriod = exploitationPeriod;
    }

    public void setYear(Integer year){
        this.year = year;
    }

    public void setHeight(Integer height){
        this.height = height;
    }
}
