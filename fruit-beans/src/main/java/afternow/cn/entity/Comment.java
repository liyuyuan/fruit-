package afternow.cn.entity;

public class Comment {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.comment_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer commentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.parent_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.user_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.comment_type
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer commentType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.commected_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer commectedId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.email
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.user_name
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.content
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.comment_rank
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer commentRank;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.add_time
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private String addTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.status
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.comment_id
     *
     * @return the value of comment.comment_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getCommentId() {
        return commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.comment_id
     *
     * @param commentId the value for comment.comment_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.parent_id
     *
     * @return the value of comment.parent_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.parent_id
     *
     * @param parentId the value for comment.parent_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.user_id
     *
     * @return the value of comment.user_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.user_id
     *
     * @param userId the value for comment.user_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.comment_type
     *
     * @return the value of comment.comment_type
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getCommentType() {
        return commentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.comment_type
     *
     * @param commentType the value for comment.comment_type
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setCommentType(Integer commentType) {
        this.commentType = commentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.commected_id
     *
     * @return the value of comment.commected_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getCommectedId() {
        return commectedId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.commected_id
     *
     * @param commectedId the value for comment.commected_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setCommectedId(Integer commectedId) {
        this.commectedId = commectedId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.email
     *
     * @return the value of comment.email
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.email
     *
     * @param email the value for comment.email
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.user_name
     *
     * @return the value of comment.user_name
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.user_name
     *
     * @param userName the value for comment.user_name
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.content
     *
     * @return the value of comment.content
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.content
     *
     * @param content the value for comment.content
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.comment_rank
     *
     * @return the value of comment.comment_rank
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getCommentRank() {
        return commentRank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.comment_rank
     *
     * @param commentRank the value for comment.comment_rank
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setCommentRank(Integer commentRank) {
        this.commentRank = commentRank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.add_time
     *
     * @return the value of comment.add_time
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public String getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.add_time
     *
     * @param addTime the value for comment.add_time
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setAddTime(String addTime) {
        this.addTime = addTime == null ? null : addTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.status
     *
     * @return the value of comment.status
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.status
     *
     * @param status the value for comment.status
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}