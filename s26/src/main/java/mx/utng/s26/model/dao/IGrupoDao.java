package mx.utng.s26.model.dao;

import java.util.List;

import mx.utng.s26.model.entity.Grupo;


public interface IGrupoDao {
    //Estos metodos son abstractos no tienen cuerpo
    
    List<Grupo> list();

    void save(Grupo grupo);

    Grupo getById(Long id);

    void delete(Long id);
}
