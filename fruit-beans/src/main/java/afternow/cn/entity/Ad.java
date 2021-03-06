package afternow.cn.entity;

public class Ad {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ad.ad_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer adId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ad.position_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer positionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ad.media_type
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private String mediaType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ad.ad_name
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private String adName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ad.ad_link
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private String adLink;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ad.start_time
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private String startTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ad.end_time
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private String endTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ad.link_man
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private String linkMan;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ad.link_email
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private String linkEmail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ad.link_phone
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private String linkPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ad.click_count
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer clickCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ad.enabled
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer enabled;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ad.ad_code
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private String adCode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ad.ad_id
     *
     * @return the value of ad.ad_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getAdId() {
        return adId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ad.ad_id
     *
     * @param adId the value for ad.ad_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ad.position_id
     *
     * @return the value of ad.position_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getPositionId() {
        return positionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ad.position_id
     *
     * @param positionId the value for ad.position_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ad.media_type
     *
     * @return the value of ad.media_type
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ad.media_type
     *
     * @param mediaType the value for ad.media_type
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setMediaType(String mediaType) {
        this.mediaType = mediaType == null ? null : mediaType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ad.ad_name
     *
     * @return the value of ad.ad_name
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public String getAdName() {
        return adName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ad.ad_name
     *
     * @param adName the value for ad.ad_name
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setAdName(String adName) {
        this.adName = adName == null ? null : adName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ad.ad_link
     *
     * @return the value of ad.ad_link
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public String getAdLink() {
        return adLink;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ad.ad_link
     *
     * @param adLink the value for ad.ad_link
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setAdLink(String adLink) {
        this.adLink = adLink == null ? null : adLink.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ad.start_time
     *
     * @return the value of ad.start_time
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ad.start_time
     *
     * @param startTime the value for ad.start_time
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ad.end_time
     *
     * @return the value of ad.end_time
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ad.end_time
     *
     * @param endTime the value for ad.end_time
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ad.link_man
     *
     * @return the value of ad.link_man
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public String getLinkMan() {
        return linkMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ad.link_man
     *
     * @param linkMan the value for ad.link_man
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan == null ? null : linkMan.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ad.link_email
     *
     * @return the value of ad.link_email
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public String getLinkEmail() {
        return linkEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ad.link_email
     *
     * @param linkEmail the value for ad.link_email
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setLinkEmail(String linkEmail) {
        this.linkEmail = linkEmail == null ? null : linkEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ad.link_phone
     *
     * @return the value of ad.link_phone
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public String getLinkPhone() {
        return linkPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ad.link_phone
     *
     * @param linkPhone the value for ad.link_phone
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone == null ? null : linkPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ad.click_count
     *
     * @return the value of ad.click_count
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getClickCount() {
        return clickCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ad.click_count
     *
     * @param clickCount the value for ad.click_count
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ad.enabled
     *
     * @return the value of ad.enabled
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ad.enabled
     *
     * @param enabled the value for ad.enabled
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ad.ad_code
     *
     * @return the value of ad.ad_code
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public String getAdCode() {
        return adCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ad.ad_code
     *
     * @param adCode the value for ad.ad_code
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setAdCode(String adCode) {
        this.adCode = adCode == null ? null : adCode.trim();
    }
}