package com.ciclo3.reto.retogrupog24.servicio;

import com.ciclo3.reto.retogrupog24.entidad.Category;
import com.ciclo3.reto.retogrupog24.repositorio.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    /**
     * instancia de repositorio donde se encuentras las operaciones CRUD
     */
    @Autowired
    private CategoryRepository repository;

    /**
     * mostrar datos
     */
    public List<Category> getCategories(){
        return repository.findAll();
    }

    /**
     * guardar categoria
     * @param category
     * @return Category
     */
    public Category saveCategory(Category category){
        return repository.save(category);
    }
}
