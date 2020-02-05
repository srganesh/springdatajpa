package com.gsragavan.spring.datajpa.entity;

import javax.persistence.Entity;

@Entity
public class Employee extends AbstractDomainObject {
    private String firstName;
    private String lastName;
    private String designation;
    private Boolean isActive;

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }
}
