package il.co.myapp.domain;

public class LinesStatistics {
    
    /**
     * LinesStstistics represent domain class of the MyApp project.
     *@author Artem Meleshko
     *@version 1.0 2017
     */
    
    private Long lineId;
    private int longestWord;
    private int shortestWord;
    private int lineLength;
    private int averageWordLength;
    
    /**
     * Constructs and Initializes LinesStatistics.
     * @param lineId
     * @param longestWord
     * @param shortestWord
     * @param lineLength
     * @param averageWordLength
     */
    public LinesStatistics(Long lineId, int longestWord, int shortestWord, int lineLength, int averageWordLength){
        this.lineId = lineId;
        this.longestWord = longestWord;
        this.shortestWord = shortestWord;
        this.lineLength = lineLength;
        this.averageWordLength = averageWordLength;
    }
    
    public LinesStatistics(){}

    /**
     * @return the lineId
     */
    public Long getLineId() {
        return lineId;
    }

    /**
     * @param lineId the lineId to set
     */
    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    /**
     * @return the longestWord
     */
    public int getLongestWord() {
        return longestWord;
    }

    /**
     * @param longestWord the longestWord to set
     */
    public void setLongestWord(int longestWord) {
        this.longestWord = longestWord;
    }

    /**
     * @return the shortestWord
     */
    public int getShortestWord() {
        return shortestWord;
    }

    /**
     * @param shortestWord the shortestWord to set
     */
    public void setShortestWord(int shortestWord) {
        this.shortestWord = shortestWord;
    }

    /**
     * @return the lineLength
     */
    public int getLineLength() {
        return lineLength;
    }

    /**
     * @param lineLength the lineLength to set
     */
    public void setLineLength(int lineLength) {
        this.lineLength = lineLength;
    }

    /**
     * @return the averageWordLength
     */
    public int getAverageWordLength() {
        return averageWordLength;
    }

    /**
     * @param averageWordLength the averageWordLength to set
     */
    public void setAverageWordLength(int averageWordLength) {
        this.averageWordLength = averageWordLength;
    }
    
    

}
