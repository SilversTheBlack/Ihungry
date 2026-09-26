package com.Ihungry.hungry.Model;

import jakarta.persistence.Entity;

@Entity 
public class Client {
    private Long id;
    private String name;
    private String email;
    private String password;
    private String address;
    private String phoneNumber;
    
}
