package afternow.cn.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import afternow.cn.entity.Topic;
import afternow.cn.entity.TopicWithBLOBs;
import afternow.cn.entity.example.TopicExample;

public interface TopicMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int countByExample(TopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int deleteByExample(TopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int deleteByPrimaryKey(Integer topicId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int insert(TopicWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int insertSelective(TopicWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    List<TopicWithBLOBs> selectByExampleWithBLOBs(TopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    List<Topic> selectByExample(TopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    TopicWithBLOBs selectByPrimaryKey(Integer topicId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int updateByExampleSelective(@Param("record") TopicWithBLOBs record, @Param("example") TopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") TopicWithBLOBs record, @Param("example") TopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int updateByExample(@Param("record") Topic record, @Param("example") TopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int updateByPrimaryKeySelective(TopicWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(TopicWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic
     *
     * @mbggenerated Wed May 09 19:30:24 CST 2018
     */
    int updateByPrimaryKey(Topic record);
}