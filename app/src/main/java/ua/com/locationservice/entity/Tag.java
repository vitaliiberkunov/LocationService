package ua.com.locationservice.entity;

public class Tag {
    private int id;
    private String name;
    private double x;
    private double y;

    public Tag(int id, String name, double x, double y) {
        this.id = id;
        this.name = name;
        this.x = x;
        this.y = y;
    }
}
