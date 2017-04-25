package main.services;

import main.model.dao.Study_groupDAO;
import main.model.dao.Study_groupInterface;
import main.model.pojo.Study_group;

import java.util.List;

/**
 * Created by Троицкий Дмитрий on 20.04.2017.
 */
public class Study_groupService implements Study_groupServiceInterface {
    public static Study_groupInterface study_groupDAO = new Study_groupDAO();

    @Override
    public void create(Study_group group) {
        study_groupDAO.create( group );
    }

    @Override
    public Study_group read(int id) {
        return study_groupDAO.read( id );
    }

    @Override
    public void update(Study_group group) {
        study_groupDAO.update( group );
    }

    @Override
    public void delete(Study_group group) {
        study_groupDAO.delete( group );
    }

    @Override
    public List<Study_group> getAll() {
        return null;
    }
}
