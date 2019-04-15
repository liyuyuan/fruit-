package afternow.cn.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import afternow.cn.entity.AdPosition;
import afternow.cn.entity.example.AdPositionExample;

public interface AdPositionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_position
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int countByExample(AdPositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_position
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int deleteByExample(AdPositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_position
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int deleteByPrimaryKey(Integer positionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_position
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int insert(AdPosition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_position
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int insertSelective(AdPosition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_position
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    List<AdPosition> selectByExampleWithBLOBs(AdPositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_position
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    List<AdPosition> selectByExample(AdPositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_position
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    AdPosition selectByPrimaryKey(Integer positionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_position
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int updateByExampleSelective(@Param("record") AdPosition record, @Param("example") AdPositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_position
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") AdPosition record, @Param("example") AdPositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_position
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int updateByExample(@Param("record") AdPosition record, @Param("example") AdPositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_position
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int updateByPrimaryKeySelective(AdPosition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_position
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(AdPosition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_position
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int updateByPrimaryKey(AdPosition record);
}