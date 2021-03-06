package afternow.cn.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import afternow.cn.entity.GoodAttr;
import afternow.cn.entity.example.GoodAttrExample;

public interface GoodAttrMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_attr
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int countByExample(GoodAttrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_attr
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int deleteByExample(GoodAttrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_attr
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int deleteByPrimaryKey(Integer goodsAttrId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_attr
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int insert(GoodAttr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_attr
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int insertSelective(GoodAttr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_attr
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    List<GoodAttr> selectByExample(GoodAttrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_attr
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    GoodAttr selectByPrimaryKey(Integer goodsAttrId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_attr
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int updateByExampleSelective(@Param("record") GoodAttr record, @Param("example") GoodAttrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_attr
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int updateByExample(@Param("record") GoodAttr record, @Param("example") GoodAttrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_attr
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int updateByPrimaryKeySelective(GoodAttr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_attr
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int updateByPrimaryKey(GoodAttr record);
}