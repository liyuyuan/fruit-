package afternow.cn.entity;

public class Keywords {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column keywords.date
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private String date;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column keywords.searchengine
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private String searchengine;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column keywords.keyword
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private String keyword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column keywords.count
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer count;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column keywords.date
     *
     * @return the value of keywords.date
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public String getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column keywords.date
     *
     * @param date the value for keywords.date
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column keywords.searchengine
     *
     * @return the value of keywords.searchengine
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public String getSearchengine() {
        return searchengine;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column keywords.searchengine
     *
     * @param searchengine the value for keywords.searchengine
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setSearchengine(String searchengine) {
        this.searchengine = searchengine == null ? null : searchengine.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column keywords.keyword
     *
     * @return the value of keywords.keyword
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column keywords.keyword
     *
     * @param keyword the value for keywords.keyword
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column keywords.count
     *
     * @return the value of keywords.count
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column keywords.count
     *
     * @param count the value for keywords.count
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setCount(Integer count) {
        this.count = count;
    }
}