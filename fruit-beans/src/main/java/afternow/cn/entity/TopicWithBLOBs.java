package afternow.cn.entity;

public class TopicWithBLOBs extends Topic {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic.data
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private String data;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic.htmls
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private String htmls;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic.data
     *
     * @return the value of topic.data
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public String getData() {
        return data;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topic.data
     *
     * @param data the value for topic.data
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic.htmls
     *
     * @return the value of topic.htmls
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public String getHtmls() {
        return htmls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topic.htmls
     *
     * @param htmls the value for topic.htmls
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setHtmls(String htmls) {
        this.htmls = htmls == null ? null : htmls.trim();
    }
}