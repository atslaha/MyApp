package il.co.myapp.domain;

public class LinesStatistics {
    
    /**
     * LinesStstistics represent domain class of the MyApp project.
     *@author Artem Meleshko
     *@version 1.0 2017
     */
    
    private Integer lineId;
    private String longestWord;
    private String shortestWord;
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
    public LinesStatistics(Integer lineId, String longestWord, String shortestWord, int lineLength, int averageWordLength){
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
    public Integer getLineId() {
        return lineId;
    }

    /**
     * @param lineId the lineId to set
     */
    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    /**
     * @return the longestWord
     */
    public String getLongestWord() {
        return longestWord;
    }

    /**
     * @param longestWord the longestWord to set
     */
    public void setLongestWord(String longestWord) {
        this.longestWord = longestWord;
    }

    /**
     * @return the shortestWord
     */
    public String getShortestWord() {
        return shortestWord;
    }

    /**
     * @param shortestWord the shortestWord to set
     */
    public void setShortestWord(String shortestWord) {
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
