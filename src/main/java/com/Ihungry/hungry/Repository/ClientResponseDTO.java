package com.Ihungry.hungry.Repository;
import com.Ihungry.hungry.Model.Client;
public record ClientResponseDTO(String Name, String Email, String Address) {
public ClientResponseDTO(Client client){
    this(client.getName(), client.getEmail(), client.getAddress());
}
}
