package com.Ihungry.hungry.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;
import com.Ihungry.hungry.Repository.ClientRepository;
import com.Ihungry.hungry.Repository.ClientRequestDTO;
import com.Ihungry.hungry.Repository.ClientResponseDTO;
import com.Ihungry.hungry.Model.Client;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
@RequestMapping("/api/client")
public class ClientController {
    @Autowired
    public ClientController(){
    
    }
private ClientRepository client;

@GetMapping("/List")
public List<ClientResponseDTO> getAllClient(){
List<ClientResponseDTO> clients = client.findAll().stream()
.map(ClientResponseDTO::new)
.toList();
return clients;
    }

    @PostMapping("SaveClient")
public void saveClient(ClientRequestDTO data){
    Client clientData = new Client(data);
    client.save(clientData);
    return;
}
    
}