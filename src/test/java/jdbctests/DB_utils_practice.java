package jdbctests;

import org.junit.jupiter.api.Test;
import utilities.DB_utils;

import java.util.List;
import java.util.Map;

public class DB_utils_practice {

    @Test
    public void test1(){

        //create connection
        DB_utils.createConnection();
        String query = "SELECT first_name,last_name,salary,job_id\n" +
                "from employees\n" +
                "where rownum <6";

        List<Map<String, Object>> queryData = DB_utils.getQueryResultMap(query);

        //print the result
        for (Map<String, Object> row : queryData) {
            System.out.println(row.toString());
        }
        //close the connection
        DB_utils.destroy();

    }


    @Test
    public void test2(){

        //create connection
        DB_utils.createConnection();
        String query = "SELECT first_name,last_name,salary,job_id\n" +
                "from employees\n" +
                "where rownum <2";

        Map<String, Object> rowMap = DB_utils.getRowMap(query);

        System.out.println(rowMap.toString());

        //close the connection
        DB_utils.destroy();

    }

    

}
