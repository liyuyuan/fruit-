package afternow.cn.entity;

import java.math.BigDecimal;

public class Cart {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.cart_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer cartId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.user_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.goods_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer goodsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.goods_sn
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private String goodsSn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.product_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.goods_name
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private String goodsName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.market_price
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private BigDecimal marketPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.goods_price
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private BigDecimal goodsPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.goods_number
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer goodsNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.goods_attr
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private String goodsAttr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.is_real
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer isReal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.parent_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.rec_type
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer recType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.is_gift
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer isGift;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.is_shipping
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer isShipping;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.can_handsel
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer canHandsel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.goods_attr_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer goodsAttrId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.cart_id
     *
     * @return the value of cart.cart_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getCartId() {
        return cartId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.cart_id
     *
     * @param cartId the value for cart.cart_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.user_id
     *
     * @return the value of cart.user_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.user_id
     *
     * @param userId the value for cart.user_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.goods_id
     *
     * @return the value of cart.goods_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.goods_id
     *
     * @param goodsId the value for cart.goods_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.goods_sn
     *
     * @return the value of cart.goods_sn
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public String getGoodsSn() {
        return goodsSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.goods_sn
     *
     * @param goodsSn the value for cart.goods_sn
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn == null ? null : goodsSn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.product_id
     *
     * @return the value of cart.product_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.product_id
     *
     * @param productId the value for cart.product_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.goods_name
     *
     * @return the value of cart.goods_name
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.goods_name
     *
     * @param goodsName the value for cart.goods_name
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.market_price
     *
     * @return the value of cart.market_price
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.market_price
     *
     * @param marketPrice the value for cart.market_price
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.goods_price
     *
     * @return the value of cart.goods_price
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.goods_price
     *
     * @param goodsPrice the value for cart.goods_price
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.goods_number
     *
     * @return the value of cart.goods_number
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.goods_number
     *
     * @param goodsNumber the value for cart.goods_number
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.goods_attr
     *
     * @return the value of cart.goods_attr
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public String getGoodsAttr() {
        return goodsAttr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.goods_attr
     *
     * @param goodsAttr the value for cart.goods_attr
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setGoodsAttr(String goodsAttr) {
        this.goodsAttr = goodsAttr == null ? null : goodsAttr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.is_real
     *
     * @return the value of cart.is_real
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getIsReal() {
        return isReal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.is_real
     *
     * @param isReal the value for cart.is_real
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setIsReal(Integer isReal) {
        this.isReal = isReal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.parent_id
     *
     * @return the value of cart.parent_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.parent_id
     *
     * @param parentId the value for cart.parent_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.rec_type
     *
     * @return the value of cart.rec_type
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getRecType() {
        return recType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.rec_type
     *
     * @param recType the value for cart.rec_type
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setRecType(Integer recType) {
        this.recType = recType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.is_gift
     *
     * @return the value of cart.is_gift
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getIsGift() {
        return isGift;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.is_gift
     *
     * @param isGift the value for cart.is_gift
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setIsGift(Integer isGift) {
        this.isGift = isGift;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.is_shipping
     *
     * @return the value of cart.is_shipping
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getIsShipping() {
        return isShipping;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.is_shipping
     *
     * @param isShipping the value for cart.is_shipping
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setIsShipping(Integer isShipping) {
        this.isShipping = isShipping;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.can_handsel
     *
     * @return the value of cart.can_handsel
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getCanHandsel() {
        return canHandsel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.can_handsel
     *
     * @param canHandsel the value for cart.can_handsel
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setCanHandsel(Integer canHandsel) {
        this.canHandsel = canHandsel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.goods_attr_id
     *
     * @return the value of cart.goods_attr_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getGoodsAttrId() {
        return goodsAttrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.goods_attr_id
     *
     * @param goodsAttrId the value for cart.goods_attr_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setGoodsAttrId(Integer goodsAttrId) {
        this.goodsAttrId = goodsAttrId;
    }
}