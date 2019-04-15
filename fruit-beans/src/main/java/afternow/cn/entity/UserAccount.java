package afternow.cn.entity;

public class UserAccount {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_account.id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_account.user_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_account.admin_user
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private String adminUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_account.amount
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Long amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_account.add_time
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private String addTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_account.paid_time
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private String paidTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_account.admin_note
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private String adminNote;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_account.user_note
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private String userNote;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_account.process_type
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer processType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_account.payment_name
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private String paymentName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_account.is_paid
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer isPaid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_account.id
     *
     * @return the value of user_account.id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_account.id
     *
     * @param id the value for user_account.id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_account.user_id
     *
     * @return the value of user_account.user_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_account.user_id
     *
     * @param userId the value for user_account.user_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_account.admin_user
     *
     * @return the value of user_account.admin_user
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public String getAdminUser() {
        return adminUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_account.admin_user
     *
     * @param adminUser the value for user_account.admin_user
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setAdminUser(String adminUser) {
        this.adminUser = adminUser == null ? null : adminUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_account.amount
     *
     * @return the value of user_account.amount
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_account.amount
     *
     * @param amount the value for user_account.amount
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_account.add_time
     *
     * @return the value of user_account.add_time
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public String getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_account.add_time
     *
     * @param addTime the value for user_account.add_time
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setAddTime(String addTime) {
        this.addTime = addTime == null ? null : addTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_account.paid_time
     *
     * @return the value of user_account.paid_time
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public String getPaidTime() {
        return paidTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_account.paid_time
     *
     * @param paidTime the value for user_account.paid_time
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setPaidTime(String paidTime) {
        this.paidTime = paidTime == null ? null : paidTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_account.admin_note
     *
     * @return the value of user_account.admin_note
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public String getAdminNote() {
        return adminNote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_account.admin_note
     *
     * @param adminNote the value for user_account.admin_note
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setAdminNote(String adminNote) {
        this.adminNote = adminNote == null ? null : adminNote.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_account.user_note
     *
     * @return the value of user_account.user_note
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public String getUserNote() {
        return userNote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_account.user_note
     *
     * @param userNote the value for user_account.user_note
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setUserNote(String userNote) {
        this.userNote = userNote == null ? null : userNote.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_account.process_type
     *
     * @return the value of user_account.process_type
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getProcessType() {
        return processType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_account.process_type
     *
     * @param processType the value for user_account.process_type
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setProcessType(Integer processType) {
        this.processType = processType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_account.payment_name
     *
     * @return the value of user_account.payment_name
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public String getPaymentName() {
        return paymentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_account.payment_name
     *
     * @param paymentName the value for user_account.payment_name
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName == null ? null : paymentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_account.is_paid
     *
     * @return the value of user_account.is_paid
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getIsPaid() {
        return isPaid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_account.is_paid
     *
     * @param isPaid the value for user_account.is_paid
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setIsPaid(Integer isPaid) {
        this.isPaid = isPaid;
    }
}