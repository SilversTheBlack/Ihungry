package com.Ihungry.hungry.Model;

import jakarta.persistence.Entity;


@Table(name = "client")
@Entity(name = "client")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode 
public class Client {
    private Long id;
    private String name;
    private String email;
    private String password;
    private String address;
    private String phoneNumber;
    
}
