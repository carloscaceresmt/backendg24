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

    /**
     * buscar registo del cliente por su id o pk
     * @param id
     * @return Client
     */
    public Client getClient(long id){
        return repository.findById(id).orElse(null);
    }

    public void deleteClient(long id){
        repository.deleteById(id);
    }

    public Client updateClient(Client clientUpd){
        Client clientOld = getClient(clientUpd.getIdClient());
        clientOld.setName(clientUpd.getName());
        clientOld.setEmail(clientUpd.getEmail());
        clientOld.setPassword(clientUpd.getPassword());
        clientOld.setAge(clientUpd.getAge());
        return repository.save(clientOld);
    }
}
