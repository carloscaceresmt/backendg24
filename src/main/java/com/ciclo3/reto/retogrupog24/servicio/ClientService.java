package com.ciclo3.reto.retogrupog24.servicio;
import com.ciclo3.reto.retogrupog24.entidad.Client;
import com.ciclo3.reto.retogrupog24.repositorio.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository repository;

    public List<Client> getClients(){
        return repository.findAll();
    }
    public Client saveClient(Client client){
        return repository.save(client);
    }
}
