package main.services;

import main.model.pojo.Student;

import java.util.List;

/**
 * Created by Троицкий Дмитрий on 19.04.2017.
 */
public interface StudentServiceInterface {

    /** Создает новый объект класса Student */
    public void create(Student group);

    /** Получает объект класса Student по ключу id */
    public Student read(int id);

    /** Сохраняет состояние объекта класса Student в БД */
    public void update(Student group);

    /** Создает новый объект класса Student */
    public void delete(Student group);

    /** Получаем все объекты класса Student из БД */
    public List<Student> getAll();

}
