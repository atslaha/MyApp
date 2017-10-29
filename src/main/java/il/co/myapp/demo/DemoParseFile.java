package il.co.myapp.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import il.co.myapp.connection.ConnectionMysqlDB;
import il.co.myapp.connection.LinesStatisticsDAOImpl;
import il.co.myapp.domain.LinesStatistics;
import il.co.myapp.utility.LongestAndShortestWord;

/**
 * @author Artem Meleshko
 * @version 1.0 2017
 */
public class DemoParseFile {
    public static void main(String[] args) {
        LinesStatisticsDAOImpl lineDAO = new LinesStatisticsDAOImpl();
        lineDAO.setConnection(new ConnectionMysqlDB());
        LinesStatistics line = new LinesStatistics();
        LongestAndShortestWord longestAndShortestWord = new LongestAndShortestWord();
        File file = new File("file.txt");
        Scanner input;
        try {
            input = new Scanner(file);
            while(input.hasNext()) {
                String nextToken = input.nextLine();
                System.out.println(nextToken);
                String lw = longestAndShortestWord.longestWord(nextToken);
                line.setLongestWord(lw);
                System.out.println("LONGEST WORD : "+lw);
                String sw = longestAndShortestWord.shortestWord(nextToken);
                line.setShortestWord(sw);
                System.out.println("SHORTEST WORD : "+sw);
                Integer lineLength = nextToken.length();
                line.setLineLength(lineLength);
                System.out.println("Line length = "+lineLength);
                Integer average = longestAndShortestWord.avewrageWordLength(nextToken);
                line.setAverageWordLength(average);
                System.out.println("Average word length = " + average + "\n");
                lineDAO.createLineStatistic(line);
            }
           input.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
}
}
