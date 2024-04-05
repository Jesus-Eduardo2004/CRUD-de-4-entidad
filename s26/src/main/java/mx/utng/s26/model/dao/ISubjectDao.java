package mx.utng.s26.model.dao;

import java.util.List;

import mx.utng.s26.model.entity.Subject;


public interface ISubjectDao {
    //Estos metodos son abstractos no tienen cuerpo
    
    List<Subject> list();

    void save(Subject subject);

    Subject getById(Long id);

    void delete(Long id);
}
