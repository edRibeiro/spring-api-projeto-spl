package com.edribeiro.splapi.domain.entity;

import java.util.UUID;

public class User {
    private String email;
    private String password;
    private UUID ID;

    private String role;

    private Client client;

    private Employer employer;

    public Profile getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }



    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public User(String email, String password, String role) {
        this.email = email;
        this.password = password;
        this.role = role;
    }

}
