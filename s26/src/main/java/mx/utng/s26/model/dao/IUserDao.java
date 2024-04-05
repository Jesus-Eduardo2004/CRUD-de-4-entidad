package mx.utng.s26.model.dao;

import java.util.List;

import mx.utng.s26.model.entity.User;

public interface IUserDao {
    //Estos metodos son abstractos no tienen cuerpo
    
    List<User>list();

    void save(User user);

    User getById(Long id);

    void delete(Long id);
}
