package com.ciclo3.reto.retogrupog24.servicio;

import com.ciclo3.reto.retogrupog24.entidad.Category;
import com.ciclo3.reto.retogrupog24.repositorio.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.attribute.standard.PresentationDirection;
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

    public Category getCategory(long id){
        return repository.findById(id).orElse(null);
    }
    public Category saveCategory(Category category){
        return repository.save(category);
    }

    public Category updateCategory(Category categoryUpd){
        Category categoryOld = getCategory(categoryUpd.getId());
        categoryOld.setName(categoryUpd.getName());
        categoryOld.setDescription(categoryUpd.getDescription());
        return repository.save(categoryOld);
    }

    public void deleteCategory(long id){
        repository.deleteById(id);
    }




}
