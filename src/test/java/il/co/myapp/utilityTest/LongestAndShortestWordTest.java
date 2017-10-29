package il.co.myapp.utilityTest;

import static org.junit.Assert.*;

import org.junit.Test;

import il.co.myapp.utility.LongestAndShortestWord;

/**
 * @author Artem Meleshko
 * @version 1.0 2017
 */
public class LongestAndShortestWordTest {
    private LongestAndShortestWord longestAndShortestWord = new LongestAndShortestWord();
    private String str = "Sed ut perspiciatis unde omnis iste natus, error sit voluptatem accusantium doloremque laudantium.";
    
    @Test
    public void longestWordTest(){
       String longestWord = longestAndShortestWord.longestWord(str);
       assertEquals(longestWord.equals("perspiciatis"), true);
    }
    
    @Test
    public void shortestWordTest(){
        String shortestWord = longestAndShortestWord.shortestWord(str);
        assertEquals(shortestWord.equals("ut"), true);
    }
    
    @Test
    public void avewrageWordLengthTest(){
        Integer average = longestAndShortestWord.avewrageWordLength(str);
        assertEquals(average.equals(6), true);
    }

}
