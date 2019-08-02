package com.shams.spring.springbootcrudmysql.springbootcrudmysql.model;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String firstName;
    String lastName;
    String mobileNumber;

    @OneToOne
    Address address;

    public Student() {
    }

    public Student(String firstName, String lastName, String mobileNumber, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFullName() {
        return String.join(" ", this.firstName, this.lastName);
    }

    public void validate() throws Exception{
        if (this.firstName.isEmpty() && this.lastName.isEmpty())
            throw new Exception("Name can not be empty");

        if (this.mobileNumber.length() > 13 || this.mobileNumber.length() < 11)
            throw new Exception("Invalid mobile number");
    }
}
