package main.services;

import main.model.pojo.Journal;
import java.util.List;

/**
 * Created by Троицкий Дмитрий on 20.04.2017.
 */
public interface JournalServiceInterface {

    /** Создает новый объект класса Journal */
    public void create(Journal journal);

    /** Получает объект класса Journal по ключу id */
    public Journal read(int id);

    /** Сохраняет состояние объекта класса Journal в БД */
    public void update(Journal journal);

    /** Создает новый объект класса Journal */
    public void delete(Journal journal);

    /** Получаем все объекты класса Journal из БД */
    public List<Journal> getAll();

}
