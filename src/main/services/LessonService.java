package main.services;

import main.model.dao.LessonDAO;
import main.model.dao.LessonInterface;
import main.model.pojo.Lesson;

import java.util.List;

/**
 * Created by Троицкий Дмитрий on 20.04.2017.
 */
public class LessonService implements LessonServiceInterface {
    private static LessonInterface lessonDAO = new LessonDAO();
    @Override
    public void create(Lesson lesson) {
        lessonDAO.create( lesson );
    }

    @Override
    public Lesson read(int id) {
        return lessonDAO.read( id );
    }

    @Override
    public void update(Lesson lesson) {
        lessonDAO.update( lesson );
    }

    @Override
    public void delete(Lesson lesson) {
        lessonDAO.delete( lesson );
    }

    @Override
    public List<Lesson> getAll() {
        return lessonDAO.getAll();
    }
}
