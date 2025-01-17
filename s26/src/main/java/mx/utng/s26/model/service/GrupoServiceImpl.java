package mx.utng.s26.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mx.utng.s26.model.dao.IGrupoDao;
import mx.utng.s26.model.entity.Grupo;

@Service
public class GrupoServiceImpl implements IGrupoService{

    //Inserta una interfaz para utilizar sus metodos
    @Autowired
    private IGrupoDao grupoDao;

    @Transactional(readOnly = true)
    @Override
    public List<Grupo> list() {
        return grupoDao.list();
    }

    @Transactional
    @Override
    public void save(Grupo grupo) {
        grupoDao.save(grupo);
    }

    @Transactional(readOnly = true)
    @Override
    public Grupo getById(Long id) {
        return grupoDao.getById(id);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        grupoDao.delete(id);
    }
    
}
