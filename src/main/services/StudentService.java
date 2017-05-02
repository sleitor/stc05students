package main.services;

import main.model.dao.StudentInterface;
import main.model.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Троицкий Дмитрий on 19.04.2017.
 */

@Service
public class StudentService implements StudentServiceInterface {

    public StudentInterface getStudentDAO() {
        return studentDAO;
    }


    public void setStudentDAO(StudentInterface studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Autowired
    private StudentInterface studentDAO;

    @Override
    public void create(Student student) {
        studentDAO.create( student );
    }

    @Override
    public Student read(long id) {
        return studentDAO.read( id );
    }

    public StudentService(StudentInterface studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override

    public void update(Student student) {
        studentDAO.update( student );
    }

    @Override
    public void delete(long id) {
        studentDAO.delete( id );
    }

    @Override
    public List<Student> getAll() {
        return studentDAO.getAll();
    }
}