package homework_nr_21;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final String connectionString= "jdbc:postgresql://localhost/postgres";
    private static final String selectAllFromStudentsTable = "select * from students";
    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);

//        Напишите метод для добавления новой записи студента в базу данных с использованием prepared statement.
//        Запросите у пользователя через консоль имя студента, возраст и оценку и вставьте эту информацию в базу данных.

        try(Connection connection = DriverManager.getConnection(connectionString, "postgres", "postgres")){
            System.out.println("The connection has been made");

            System.out.println("Enter student's name: "); String name = scanner.next();
            System.out.println("Enter student's age: "); Integer age = Integer.valueOf(scanner.next());
            System.out.println("Enter student's grade: "); Integer grade = Integer.valueOf(scanner.next());
//
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQueries.ADD_A_NEW_STUDENT.query);



            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.setInt(3, grade);


            preparedStatement.execute();

            System.out.println("Student added successfully");

        } catch(SQLException e) {
            e.printStackTrace();
        }


//        Реализуйте метод, позволяющий обновить оценку студента на основе его ID.
//        Запросите у пользователя ввести ID студента и новую оценку для обновления записи в базе данных.

        try(Connection connection = DriverManager.getConnection(connectionString, "postgres", "postgres")){
            System.out.println("The connection has been made");

            System.out.println("Enter student's ID to change it's grade"); Integer id = scanner.nextInt();
            System.out.println("Enter the new grade of the selected student"); Integer grade = scanner.nextInt();
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQueries.UPDATE_STUDENT_GRADE.query);

            preparedStatement.setInt(1, grade);
            preparedStatement.setInt(2, id);
            preparedStatement.execute();

            System.out.println("Student's grade changed successfully");


        } catch(SQLException e){
            e.printStackTrace();
        }

//        Создайте метод для удаления записи студента на основе его ID.
//        Запросите у пользователя ввести ID студента для удаления соответствующей записи из базы данных.

        try(Connection connection = DriverManager.getConnection(connectionString, "postgres", "postgres")){
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQueries.DELETE_STUDENT.query);

            System.out.println("Enter student's ID to delete: "); Integer id = scanner.nextInt();
            preparedStatement.setInt(1, id);
            preparedStatement.execute();

            System.out.println("Student deleted successfully");

        } catch(SQLException e){
            e.printStackTrace();
        }

//        Напишите метод для извлечения и отображения всех записей студентов из базы данных.
//        Отобразите полученные записи в отформатированном виде.

        try(Connection connection = DriverManager.getConnection(connectionString, "postgres", "postgres")){
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(selectAllFromStudentsTable);

            while(resultSet.next()){
                System.out.print(resultSet.getString("id") + "| ");
                System.out.print(resultSet.getString("name") + "| ");
                System.out.print(resultSet.getString("age") + "| ");
                System.out.print(resultSet.getString("grade") + "| \n");
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
