package afternow.cn.entity;

public class Tag {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.tag_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer tagId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.user_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.goods_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer goodsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.tag_words
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private String tagWords;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.tag_id
     *
     * @return the value of tag.tag_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getTagId() {
        return tagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.tag_id
     *
     * @param tagId the value for tag.tag_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.user_id
     *
     * @return the value of tag.user_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.user_id
     *
     * @param userId the value for tag.user_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.goods_id
     *
     * @return the value of tag.goods_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.goods_id
     *
     * @param goodsId the value for tag.goods_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.tag_words
     *
     * @return the value of tag.tag_words
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public String getTagWords() {
        return tagWords;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.tag_words
     *
     * @param tagWords the value for tag.tag_words
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setTagWords(String tagWords) {
        this.tagWords = tagWords == null ? null : tagWords.trim();
    }
}