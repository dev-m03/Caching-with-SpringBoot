package com.example.CachingMech;

public class Cookies {
    private String id;
    private String brand;

    public Cookies (String id , String brand)
    {
        this.id =id;
        this.brand = brand;

    }

//No use of getter setter since we arent using them anywhere in the logic
    @Override
    public String toString()
    {
        return "Cookie{"+"id="+id+","+",brand="+brand+"}";
    }
}
