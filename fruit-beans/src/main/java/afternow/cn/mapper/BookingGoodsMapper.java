package afternow.cn.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import afternow.cn.entity.BookingGoods;
import afternow.cn.entity.example.BookingGoodsExample;

public interface BookingGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table booking_goods
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int countByExample(BookingGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table booking_goods
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int deleteByExample(BookingGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table booking_goods
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int deleteByPrimaryKey(Integer recId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table booking_goods
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int insert(BookingGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table booking_goods
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int insertSelective(BookingGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table booking_goods
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    List<BookingGoods> selectByExample(BookingGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table booking_goods
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    BookingGoods selectByPrimaryKey(Integer recId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table booking_goods
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int updateByExampleSelective(@Param("record") BookingGoods record, @Param("example") BookingGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table booking_goods
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int updateByExample(@Param("record") BookingGoods record, @Param("example") BookingGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table booking_goods
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int updateByPrimaryKeySelective(BookingGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table booking_goods
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int updateByPrimaryKey(BookingGoods record);
}