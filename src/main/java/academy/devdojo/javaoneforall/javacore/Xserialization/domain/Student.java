package academy.devdojo.javaoneforall.javacore.Xserialization.domain;

import java.io.*;

//159 - Utility Classes - Serialization pt 01
//160 - Utility Classes - Serialization pt 02

//CTRL+SHIFT+A and search for "Serializable class without 'serialVersionUID' --> On

public class Student implements Serializable {

    @Serial
    private static final long serialVersionUID = 2860882953976732707L;
    private Long id;
    private String name;
    private transient String password; //transient is when you want to hide the data
    private transient Seminar seminar;
    private final static String SCHOOL_NAME = "DevDojo";

    public Student(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    private void writeObject(ObjectOutputStream oos){
        try{
            oos.defaultWriteObject();
            oos.writeUTF(seminar.getName());
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream ois){
        try{
            ois.defaultReadObject();
            String seminarName = ois.readUTF();
            this.seminar = new Seminar(seminarName);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", seminar='" + seminar + '\'' +
                ", school_name='" + SCHOOL_NAME + '\'' +

                '}';
    }

    public Seminar getSeminar() {
        return seminar;
    }

    public void setSeminar(Seminar seminar) {
        this.seminar = seminar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
