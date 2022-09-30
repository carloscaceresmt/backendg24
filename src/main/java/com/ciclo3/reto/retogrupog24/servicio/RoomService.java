package com.ciclo3.reto.retogrupog24.servicio;

import com.ciclo3.reto.retogrupog24.entidad.Category;
import com.ciclo3.reto.retogrupog24.entidad.Room;
import com.ciclo3.reto.retogrupog24.repositorio.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    @Autowired
    RoomRepository repository;

    public List<Room> getRooms(){
        return repository.findAll();
    }

    public Room saveRoom(Room room){
        return repository.save(room);
    }

    public Room getRoom(long id){
        return repository.findById(id).orElse(null);
    }

    public Room updateRoom(Room roomUpd){
        Room roomOld = getRoom(roomUpd.getId());
        roomOld.setName(roomUpd.getName());
        roomOld.setHotel(roomUpd.getHotel());
        roomOld.setStars(roomUpd.getStars());
        roomOld.setDescription(roomUpd.getDescription());
        roomOld.setCategory(roomUpd.getCategory());
        return repository.save(roomOld);
    }
    public void deleteRoom(long id){
        repository.deleteById(id);
    }




}
