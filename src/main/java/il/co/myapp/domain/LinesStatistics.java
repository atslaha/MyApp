package il.co.myapp.domain;

import java.util.Objects;

public class LinesStatistics {
    
    /**
     * LinesStstistics represent domain class of the MyApp project.
     *@author Artem Meleshko
     *@version 1.0 2017
     */
    
    private Integer lineId;
    private String longestWord;
    private String shortestWord;
    private Integer lineLength;
    private Integer averageWordLength;
    
    /**
     * Constructs and Initializes LinesStatistics.
     * @param lineId
     * @param longestWord
     * @param shortestWord
     * @param lineLength
     * @param averageWordLength
     */
    public LinesStatistics(Integer lineId, String longestWord, String shortestWord, Integer lineLength, Integer averageWordLength){
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
    public Integer getLineLength() {
        return lineLength;
    }

    /**
     * @param lineLength the lineLength to set
     */
    public void setLineLength(Integer lineLength) {
        this.lineLength = lineLength;
    }

    /**
     * @return the averageWordLength
     */
    public Integer getAverageWordLength() {
        return averageWordLength;
    }

    /**
     * @param averageWordLength the averageWordLength to set
     */
    public void setAverageWordLength(Integer averageWordLength) {
        this.averageWordLength = averageWordLength;
    }
    
    @Override
    public String toString(){
        return "LineStatistic [lineId=" + lineId + ", longestWord=" + longestWord + ", shortestWord=" + shortestWord + 
                ", lineLength=" + lineLength + ", awerageWordLength=" + averageWordLength + "]";
    }
    
    /**
     * Returns a hash code value for the object.
     */
    @Override
    public int hashCode() {
        Integer result = 17;
        result = result*37 + longestWord.hashCode();
        result = result*37 + shortestWord.hashCode();
        result = result*37 + lineLength.hashCode();
        result = result*37 + averageWordLength.hashCode();
        return result;
    }
    
    /**
     * Indicates whether some other object is "equal to" this one.
     */
    @Override
    public boolean equals(Object s){
        if (s == this)
            return true;
        if (!(s instanceof LinesStatistics))
            return false;
        LinesStatistics other = (LinesStatistics)s;
        return (Objects.equals(longestWord, other.longestWord) && Objects.equals(shortestWord, other.shortestWord) 
                && Objects.equals(lineLength, other.lineLength) && Objects.equals(averageWordLength, other.averageWordLength));
    }
    
    

}
