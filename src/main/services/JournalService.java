package main.services;

import main.model.dao.JournalDAO;
import main.model.dao.JournalInterface;
import main.model.pojo.Journal;

import java.util.List;

/**
 * Created by Троицкий Дмитрий on 20.04.2017.
 */
public class JournalService implements JournalServiceInterface {
    private static JournalInterface journalDAO = new JournalDAO();

    @Override
    public void create(Journal journal) {
        journalDAO.create( journal );
    }

    @Override
    public Journal read(int id) {
        return journalDAO.read( id );
    }

    @Override
    public void update(Journal journal) {
        journalDAO.update( journal );
    }

    @Override
    public void delete(Journal journal) {
        journalDAO.delete( journal );
    }

    @Override
    public List<Journal> getAll() {
        return journalDAO.getAll();
    }
}
