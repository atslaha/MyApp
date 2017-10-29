package il.co.myapp.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import il.co.myapp.connection.ConnectionDB;
import il.co.myapp.connection.ConnectionMysqlDB;
import il.co.myapp.connection.LinesStatisticsDAOImpl;
import il.co.myapp.domain.LinesStatistics;



public class Demo {

    public static void main(String[] args) {
        LinesStatisticsDAOImpl lineDAO = new LinesStatisticsDAOImpl();
        lineDAO.setConnection(new ConnectionMysqlDB());
        LinesStatistics line = new LinesStatistics();
        line = lineDAO.findId(3);
        
        //lineDAO.createLineStatistic(line);
        //lineDAO.deleteById(line);
        line.setLongestWord("prprpr");
        line.setLineId(2);
        System.out.println(line);
        lineDAO.updateLineStatistic(line);

    }

}
