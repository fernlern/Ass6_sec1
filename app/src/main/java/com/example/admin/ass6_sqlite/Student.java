package com.example.admin.ass6_sqlite;

public class Student {
    public static final String TABLE_NAME = "students";

    public static final String COLUMN_ID = "std_id";
    public static final String COLUMN_NAME = "std_name";
    public static final String COLUMN_NAME1 = "std_name1";

    private String id;
    private String name;
    private String name1;

    public  static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " TEXT,"
                    + COLUMN_NAME + " TEXT"
                    + ")";

    public Student(String id, String name, String name1) {
        this.id = id;
        this.name = name;
        this.name = name1;
    }

    public Student() {}
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getName1() { return name1; }
    public void setName1(String name1) { this.name1 = name; }
}
