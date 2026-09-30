package com.Ihungry.hungry.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Ihungry.hungry.Model.Client;
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    
}
