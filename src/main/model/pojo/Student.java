package main.model.pojo;

/**
 * Created by Троицкий Дмитрий on 19.04.2017.
 */
public class Student {

    private int id;
    private String name;
    private int age;
    private int group_id;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGroup_id() {
        return group_id;
    }

    public Student(int id, String name, int age, int group_id) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.group_id = group_id;
    }
}
