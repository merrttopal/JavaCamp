package Entities;

import Abstract.Entity;
import java.sql.Time;

public class Customer implements Entity {
    private int id;
    private String firstName;
    private String lastName;
    private int dateofyear;
    private String nationalityId;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalityId() {
        return nationalityId;
    }
    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }
    public int getDateofyear() {
        return dateofyear;
    }

    public void setDateofyear(int dateofyear) {
        this.dateofyear = dateofyear;
    }

}
