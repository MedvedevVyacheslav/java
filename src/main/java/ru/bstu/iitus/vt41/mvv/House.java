package ru.bstu.iitus.vt41.mvv;

public abstract class House extends Construction {
    private Integer count; //количество этажей
    private String material; //материал здания
    private Double area; //площадь здания

    public Integer getCount() {
        return count;
    }

    public String getMaterial() {
        return material;
    }

    public Double getArea() {
        return area;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public void setArea(Double area) {
        this.area = area;
    }
}
