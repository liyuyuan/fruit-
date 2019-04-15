package afternow.cn.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import afternow.cn.entity.Shipping;
import afternow.cn.entity.example.ShippingExample;

public interface ShippingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int countByExample(ShippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int deleteByExample(ShippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int deleteByPrimaryKey(Integer shippingId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int insert(Shipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int insertSelective(Shipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    List<Shipping> selectByExample(ShippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    Shipping selectByPrimaryKey(Integer shippingId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int updateByExampleSelective(@Param("record") Shipping record, @Param("example") ShippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int updateByExample(@Param("record") Shipping record, @Param("example") ShippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int updateByPrimaryKeySelective(Shipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int updateByPrimaryKey(Shipping record);
}