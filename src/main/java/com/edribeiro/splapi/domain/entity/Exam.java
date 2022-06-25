package com.edribeiro.splapi.domain.entity;

import java.util.UUID;

public class Exam {
    private UUID ID;
    private Patient patient;
    private String laudo;
    private String status;
    private Medic medic;
    private Employer employer;
}
