package il.co.myapp.DAOTest;
import static org.junit.Assert.*;

import java.sql.SQLException;
import java.sql.Statement;

import javax.script.ScriptException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import il.co.myapp.connection.ConnectionDB;
import il.co.myapp.connection.ConnectionH2DB;
import il.co.myapp.connection.LinesStatisticsDAOImpl;
import il.co.myapp.domain.LinesStatistics;

/**Implements tests for the LinesStatisticsDAOImpl.java
 * @author Artem Meleshko
 * @version 1.0 2017
 */
public class LinesStatisticsDAOImplTest {

    private static final String CREATE_TEST_TABLE = "CREATE TABLE stat(line_id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT, "
            + "longest_word VARCHAR(60) NULL, shortest_word VARCHAR(32) NULL, line_length INTEGER(100) NULL, "
            + "average_w_length INTEGER(100) NULL, PRIMARY KEY (line_id));";
    private  static final String INSRT_TEST_USER = "INSERT INTO stat (longest_word, shortest_word, line_length, average_w_length) "
            + "VALUES ('bigest', 'dig', 9, 5);";
    private static final String DROP_TEST_TABLE = "DROP TABLE stat";
    
    private LinesStatisticsDAOImpl lineDAO = new LinesStatisticsDAOImpl();
    private ConnectionDB connect = new ConnectionH2DB();
    
    @Before
    public void before() throws ScriptException, SQLException {
        lineDAO.setConnection(connect);
        Statement statement = lineDAO.getConnection().createStatement();
        statement.executeUpdate(CREATE_TEST_TABLE);
    }
    
    @After
    public void after() throws ScriptException, SQLException {
        lineDAO.setConnection(connect);
        Statement statement = lineDAO.getConnection().createStatement();
        statement.executeUpdate(DROP_TEST_TABLE);
    }
    
    @Test
    public void findIdTest(){
        LinesStatistics lineStatistic = new LinesStatistics(null, "longest", "dig", 9, 5);
        lineDAO.createLineStatistic(lineStatistic);
        Integer id = lineDAO.findId(1).getLineId();
        assertEquals(id.equals(1), true);
    }
    
    @Test
    public void createLineStatisticTest(){
        LinesStatistics lineStatistic = new LinesStatistics(null, "longest", "dig", 9, 5);
        lineDAO.createLineStatistic(lineStatistic);
        assertEquals(lineStatistic.equals(lineDAO.findId(1)), true);
    }
    
    @Test
    public void updateLineStatisticTest(){
        LinesStatistics lineStatistic = new LinesStatistics(null, "longest", "dig", 9, 5);
        lineDAO.createLineStatistic(lineStatistic);
        lineStatistic = lineDAO.findId(1);
        lineStatistic.setLineLength(7);
        lineDAO.updateLineStatistic(lineStatistic);
        assertEquals(lineDAO.findId(1).getLineLength().equals(7), true);
    }
    
    @Test
    public void deleteByIdTest(){
        LinesStatistics lineStatistic = new LinesStatistics(null, "longest", "dig", 9, 5);
        lineDAO.createLineStatistic(lineStatistic);
        lineStatistic = lineDAO.findId(1);
        lineDAO.deleteById(lineStatistic);
        System.out.println(lineDAO.findId(1));
        assertEquals(lineDAO.findId(1).getLineId()==null, true);
    }
}
