package br.com.carstore.dao;

import br.com.carstore.model.Car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CarDao {
    public void createCar(Car car){
        String SQL = "INSERT INTO CAR {NAME} VALUES{?}";

        try{
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test","sa","sa");
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, car.getNome());
            preparedStatement.execute();

            System.out.println("Success in connection");
        }catch (Exception e){
            System.out.println("Fail in connection");

        }

    }
}
