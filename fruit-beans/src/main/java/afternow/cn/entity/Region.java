package afternow.cn.entity;

public class Region {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column region.region_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer regionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column region.parent_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column region.next_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private Integer nextId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column region.region_name
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    private String regionName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column region.region_id
     *
     * @return the value of region.region_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getRegionId() {
        return regionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column region.region_id
     *
     * @param regionId the value for region.region_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column region.parent_id
     *
     * @return the value of region.parent_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column region.parent_id
     *
     * @param parentId the value for region.parent_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column region.next_id
     *
     * @return the value of region.next_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Integer getNextId() {
        return nextId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column region.next_id
     *
     * @param nextId the value for region.next_id
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setNextId(Integer nextId) {
        this.nextId = nextId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column region.region_name
     *
     * @return the value of region.region_name
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column region.region_name
     *
     * @param regionName the value for region.region_name
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName == null ? null : regionName.trim();
    }
}