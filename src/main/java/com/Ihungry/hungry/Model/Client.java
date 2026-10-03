package com.Ihungry.hungry.Model;

import com.Ihungry.hungry.Repository.FoodRequestDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;  
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import com.Ihungry.hungry.Repository.ClientRequestDTO;
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
    private String cpf;
    

    public Client(ClientRequestDTO data) {
        this.name = data.name();
        this.email = data.email();
        this.address = data.address();
    }
}
