package afternow.cn.entity;

public class GoodAttr {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column good_attr.goods_attr_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer goodsAttrId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column good_attr.goods_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer goodsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column good_attr.attr_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer attrId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column good_attr.attr_value
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private String attrValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column good_attr.attr_pric
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Long attrPric;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column good_attr.goods_attr_id
     *
     * @return the value of good_attr.goods_attr_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getGoodsAttrId() {
        return goodsAttrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column good_attr.goods_attr_id
     *
     * @param goodsAttrId the value for good_attr.goods_attr_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setGoodsAttrId(Integer goodsAttrId) {
        this.goodsAttrId = goodsAttrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column good_attr.goods_id
     *
     * @return the value of good_attr.goods_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column good_attr.goods_id
     *
     * @param goodsId the value for good_attr.goods_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column good_attr.attr_id
     *
     * @return the value of good_attr.attr_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getAttrId() {
        return attrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column good_attr.attr_id
     *
     * @param attrId the value for good_attr.attr_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setAttrId(Integer attrId) {
        this.attrId = attrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column good_attr.attr_value
     *
     * @return the value of good_attr.attr_value
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public String getAttrValue() {
        return attrValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column good_attr.attr_value
     *
     * @param attrValue the value for good_attr.attr_value
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue == null ? null : attrValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column good_attr.attr_pric
     *
     * @return the value of good_attr.attr_pric
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Long getAttrPric() {
        return attrPric;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column good_attr.attr_pric
     *
     * @param attrPric the value for good_attr.attr_pric
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setAttrPric(Long attrPric) {
        this.attrPric = attrPric;
    }
}