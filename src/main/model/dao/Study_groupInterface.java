package main.model.dao;

import main.model.pojo.Study_group;

import java.util.List;

/**
 * Created by Троицкий Дмитрий on 19.04.2017.
 */
public interface Study_groupInterface {

    /** Создает новый объект класса Study_group */
    public Study_group create(Study_group group);

    /** Получает объект класса Study_group по ключу id */
    public Study_group read(int id);

    /** Сохраняет состояние объекта класса Study_group в БД */
    public void update(Study_group group);

    /** Создает новый объект класса Study_group */
    public void delete(Study_group group);

    /** Получаем все объекты класса Study_group из БД */
    public List<Study_group> getAll();



}
