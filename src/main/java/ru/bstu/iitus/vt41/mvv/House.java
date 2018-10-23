package ru.bstu.iitus.vt41.mvv;

import lombok.Data;

@Data
public abstract class House extends Construction {

    private Integer count;
    private String material;
    private Double area;


}
