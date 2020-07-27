package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
// Не обязательная аннотация @Table(name="Название таблицы") Если имя класса и таблицы не совпадают
// Entity Class не может быть final
public class FamilyMember {
    @Id
//  @GeneratedeValue - генерация ключа автоматически
    private int id;
    @Column// Не обязательная аннотация, только если нужно уточнить имена или параметры колонок
    private String fname;

    @Column
//  @Transient - Так же как поля в synchronized. Чтоб исключить поле
    private String sname;
    @Column
    private Date dateofbirth;

// Конструктор без параметров ОБЯЗАТЕЛЕН для JPA
    public FamilyMember() {
    }

    public FamilyMember(int id, String fname, String sname, Date dateofbirth) {
        this.id = id;
        this.fname = fname;
        this.sname = sname;
        this.dateofbirth = dateofbirth;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String getSname() {
        return sname;
    }

    public java.sql.Date getDateofbirth() {
        return dateofbirth;
    }

    @Override
    public String toString() {
        return "com.hibernate.FamilyMember " + "| id | " + id + "| fname | " + fname + "| sname |" + sname + "| dateofbirth |"
                + dateofbirth +
                '}';
    }
}
