package com.Ihungry.hungry.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client")
public class ClientController {
    @Autowired
    public ClientController(){
    
    }
private ClientRepository client;

@GetMapping("/List")
public List<ClientRepository> getAllClient(){
public List<ClientRepository> clients = client.findAll().stream()
.map(ClientRepository::new)
.toList();
return clients;
    }

    @PostMapping("SaveClient")
public void saveClient(ClientRepository data){
    Client clientData = new Client(data);
    client.save(clientData);
    return;
}
    
}