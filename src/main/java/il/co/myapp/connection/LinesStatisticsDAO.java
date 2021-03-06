package il.co.myapp.connection;

import il.co.myapp.domain.LinesStatistics;

/**
 * This interface represents a contract for a DAO for the LinesStatistics model.
 * @author Artem Meleshko
 * @version 1.0 2017
 *
 */
public interface LinesStatisticsDAO {
    
    /**
     * Returns LinesStatistics from the database matching the given lines_id in the List, otherwise returns LinesStatistics object 
     * with the fields filled with null. 
     * @param (long) ID of the LinesStatistics to be returned.
     * @return (LinesStatistics) object from the database matching the given ID, otherwise returns User object 
     * with the fields filled with null.
     * @throws RuntimeException if something fails at the database level.
     */
    public LinesStatistics findId(Integer id) throws RuntimeException;
    
    /**
     * Create a new LinesStatistics in the database. The line_id must be null, database will generate a new line_id.
     * @throws RuntimeException if something fails at the database level.
     */
    public void createLineStatistic(LinesStatistics lineStatistic) throws RuntimeException;
    
    /**
     * Updates the given LinesStatistics in the database. line_id must not be null, otherwise it will throw 
     * IllegalArgumentException.  
     * @throws IllegalArgumentException if the line_id is null.
     * @throws RuntimeException if something fails at the database level.
     */
    public void updateLineStatistic(LinesStatistics lineStatistic) throws IllegalArgumentException, RuntimeException;
    
    /**
     * Deletes user from the database matching with the given email.
     * @param connect (Connection) object with already existed connection to the database.
     * @param email user's email.
     * @throws RuntimeException if something fails at the database level.
     */
    public void deleteById(LinesStatistics lineStatistic) throws RuntimeException;

}
