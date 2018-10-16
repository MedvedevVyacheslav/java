package ru.bstu.iitus.vt41.mvv;

public abstract class Overpass extends Construction {
    private Double lenght; //длина путепровода

    public Double getLenght() {
        return lenght;
    }

    public void setLenght(Double lenght) {
        this.lenght = lenght;
    }
}
