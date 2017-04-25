package main.services;

import main.model.pojo.Lesson;

import java.util.List;

/**
 * Created by Троицкий Дмитрий on 20.04.2017.
 */
public interface LessonServiceInterface {

    /** Создает новый объект класса Lesson */
    public void create(Lesson lesson);

    /** Получает объект класса Lesson по ключу id */
    public Lesson read(int id);

    /** Сохраняет состояние объекта класса Lesson в БД */
    public void update(Lesson lesson);

    /** Создает новый объект класса Lesson */
    public void delete(Lesson lesson);

    /** Получаем все объекты класса Lesson из БД */
    public List<Lesson> getAll();

}
