package afternow.cn.entity;

public class UserToken {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_token.user_id
     *
     * @mbggenerated Mon May 14 21:18:27 CST 2018
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_token.user_token
     *
     * @mbggenerated Mon May 14 21:18:27 CST 2018
     */
    private String userToken;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_token.expire_time
     *
     * @mbggenerated Mon May 14 21:18:27 CST 2018
     */
    private String expireTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_token.create_time
     *
     * @mbggenerated Mon May 14 21:18:27 CST 2018
     */
    private String createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_token.user_id
     *
     * @return the value of user_token.user_id
     *
     * @mbggenerated Mon May 14 21:18:27 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_token.user_id
     *
     * @param userId the value for user_token.user_id
     *
     * @mbggenerated Mon May 14 21:18:27 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_token.user_token
     *
     * @return the value of user_token.user_token
     *
     * @mbggenerated Mon May 14 21:18:27 CST 2018
     */
    public String getUserToken() {
        return userToken;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_token.user_token
     *
     * @param userToken the value for user_token.user_token
     *
     * @mbggenerated Mon May 14 21:18:27 CST 2018
     */
    public void setUserToken(String userToken) {
        this.userToken = userToken == null ? null : userToken.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_token.expire_time
     *
     * @return the value of user_token.expire_time
     *
     * @mbggenerated Mon May 14 21:18:27 CST 2018
     */
    public String getExpireTime() {
        return expireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_token.expire_time
     *
     * @param expireTime the value for user_token.expire_time
     *
     * @mbggenerated Mon May 14 21:18:27 CST 2018
     */
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime == null ? null : expireTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_token.create_time
     *
     * @return the value of user_token.create_time
     *
     * @mbggenerated Mon May 14 21:18:27 CST 2018
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_token.create_time
     *
     * @param createTime the value for user_token.create_time
     *
     * @mbggenerated Mon May 14 21:18:27 CST 2018
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }
}