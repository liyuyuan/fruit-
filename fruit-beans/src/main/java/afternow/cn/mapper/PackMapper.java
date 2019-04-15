package afternow.cn.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import afternow.cn.entity.Pack;
import afternow.cn.entity.example.PackExample;

public interface PackMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pack
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int countByExample(PackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pack
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int deleteByExample(PackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pack
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int deleteByPrimaryKey(Integer packId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pack
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int insert(Pack record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pack
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int insertSelective(Pack record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pack
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    List<Pack> selectByExample(PackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pack
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    Pack selectByPrimaryKey(Integer packId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pack
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int updateByExampleSelective(@Param("record") Pack record, @Param("example") PackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pack
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int updateByExample(@Param("record") Pack record, @Param("example") PackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pack
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int updateByPrimaryKeySelective(Pack record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pack
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int updateByPrimaryKey(Pack record);
}