package il.co.myapp.connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;


import il.co.myapp.domain.LinesStatistics;

/**
 * LinesStatisticsDAOImpl represents DAO for the domain class User. 
 * @author Artem Meleshko
 * @version 1.0 2017
 */
public class LinesStatisticsDAOImpl extends AbstractDAO implements LinesStatisticsDAO {
    private static final String SQL_FIND_BY_ID =
            "SELECT line_id, longest_word, shortest_word, line_length, average_w_length FROM stat WHERE line_id = ?";
    private static final String SQL_INSERT =
            "INSERT INTO stat (longest_word, shortest_word, line_length, average_w_length) VALUES (?, ?, ?, ?)";
    private static final String SQL_UPDATE =
            "UPDATE stat SET longest_word = ?, shortest_word = ?, line_length = ?, average_w_length = ? WHERE line_id = ?";
    private static final String SQL_DELETE =
            "DELETE FROM stat WHERE line_id = ?";

    @Override
    public LinesStatistics findId(Integer id) throws RuntimeException {
        LinesStatistics lineStatistic = new LinesStatistics();
        try {
            PreparedStatement statement = getConnection().prepareStatement(SQL_FIND_BY_ID);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                lineStatistic = map(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lineStatistic;
    }

    @Override
    public void createLineStatistic(LinesStatistics lineStatistic) throws RuntimeException {
        Object[] values = {
                lineStatistic.getLongestWord(),
                lineStatistic.getShortestWord(),
                lineStatistic.getLineLength(),
                lineStatistic.getAverageWordLength()
            };
            updateQuery(SQL_INSERT, values);
    }

    @Override
    public void updateLineStatistic(LinesStatistics lineStatistic) throws IllegalArgumentException, RuntimeException {
        Object[] values = {
                lineStatistic.getLongestWord(),
                lineStatistic.getShortestWord(),
                lineStatistic.getLineLength(),
                lineStatistic.getAverageWordLength(),
                lineStatistic.getLineId()
            };
            updateQuery(SQL_UPDATE, values);
        
    }

    @Override
    public void deleteById(LinesStatistics lineStatistic) throws RuntimeException {
        try {
            PreparedStatement statement = getConnection().prepareStatement(SQL_DELETE);
            statement.setInt(1, lineStatistic.getLineId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
    private static LinesStatistics map(ResultSet resultSet) throws SQLException{
        LinesStatistics lineStatistic = new LinesStatistics();
            lineStatistic.setLineId((Integer)resultSet.getInt("line_id"));
            lineStatistic.setLongestWord(resultSet.getString("longest_word"));
            lineStatistic.setShortestWord(resultSet.getString("shortest_word"));
            lineStatistic.setLineLength(resultSet.getInt("line_length"));
            lineStatistic.setAverageWordLength(resultSet.getInt("average_w_length"));
        return lineStatistic;
    }

}
