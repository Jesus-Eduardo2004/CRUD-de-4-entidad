package mx.utng.s26.model.dao;

import java.util.List;

import mx.utng.s26.model.entity.Professor;


public interface IProfessorDao {
    //Estos metodos son abstractos no tienen cuerpo
    
    List<Professor> list();

    void save(Professor professor);

    Professor getById(Long id);

    void delete(Long id);
}
