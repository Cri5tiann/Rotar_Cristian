package homework_nr_21;

public enum SQLQueries {

    ADD_A_NEW_STUDENT("insert into students(name, age, grade) values (?, ?, ?)"),
    UPDATE_STUDENT_GRADE("update students set grade=? where id=?"),
    DELETE_STUDENT("delete from students where id=?");



    final String query;

    SQLQueries(String query) {
        this.query = query;
    }
}
