package com.edribeiro.splapi.domain.entity;

import java.util.Date;
import java.util.UUID;

public class Client implements Profile{

    private UUID ID;
    private String name;
    private Date birthday;
    private String gender;
    private Address address;
    private Contact contact;
    private Telephone telephone;

    public Client() {
    }

    public Client(String name, Date birthday, String gender, Address address, Contact contact, Telephone telephone) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.address = address;
        this.contact = contact;
        this.telephone = telephone;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public void setTelephone(Telephone telephone) {
        this.telephone = telephone;
    }

    @Override
    public void getId() {

    }

    @Override
    public void getName() {

    }

    @Override
    public void getBirthday() {

    }

    @Override
    public void getGender() {

    }

    @Override
    public void getAddress() {

    }

    @Override
    public void getContact() {

    }

    @Override
    public void getTelephone() {

    }
}
