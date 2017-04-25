package main.model.dao;

import main.model.DataBaseConnector;
import main.model.pojo.Student;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Троицкий Дмитрий on 19.04.2017.
 */
@Repository
public class StudentDAO implements StudentInterface {

    public void create(Student student) {
        Connection db = DataBaseConnector.initConnection();

        try {
            PreparedStatement statement = db.prepareStatement( "INSERT INTO student (name, age, group_id) VALUES (?,?,?)" );

            statement.setString( 1, student.getName() );
            statement.setInt( 2, student.getAge() );
            statement.setInt( 3, student.getGroup_id() );
            statement.executeUpdate();

            db.close();

        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public Student read(int id) {
        Connection db = DataBaseConnector.initConnection();

        try {
            Statement statement = db.createStatement();
            ResultSet resultSet = statement.executeQuery( "SELECT * FROM student where id =" + id );

            resultSet.next();
            Student student = new Student( resultSet.getInt( 1 ), resultSet.getString( 2 ), resultSet.getInt( 3 ), resultSet.getInt( 4 ) );
            return student;

        } catch(SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void update(Student student) {
        Connection db = DataBaseConnector.initConnection();

        try {
            PreparedStatement statement = db.prepareStatement( "UPDATE student SET name=?, age=?, group_id=? WHERE id="+student.getId() );
            statement.setString( 1, student.getName() );
            statement.setInt( 2, student.getAge() );
            statement.setInt( 3, student.getGroup_id() );
            statement.executeUpdate();

            db.close();

        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(Student student) {
        Connection db = DataBaseConnector.initConnection();

        try {
            Statement statement = db.createStatement();
            statement.execute( "DELETE FROM student WHERE id=" + student.getId() );

            db.close();

        } catch(SQLException e) {
            e.printStackTrace();
        }

    }

    public List<Student> getAll() {
        Connection db = DataBaseConnector.initConnection();
        List<Student> list = new ArrayList<Student>();

        try {
            Statement statement = db.createStatement();
            ResultSet resultSet = statement.executeQuery( "SELECT * FROM student" );
            while (resultSet.next()) {
                Student student = new Student( resultSet.getInt( 1 ), resultSet.getString( 2 ), resultSet.getInt( 3 ), resultSet.getInt( 4 ) );
                list.add( student );
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}
