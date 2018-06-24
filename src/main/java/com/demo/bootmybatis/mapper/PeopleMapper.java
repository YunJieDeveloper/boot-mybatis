package com.demo.bootmybatis.mapper;

import com.demo.bootmybatis.model.People;
import com.demo.bootmybatis.model.PeopleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PeopleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_people11
     *
     * @mbggenerated
     */
    int countByExample(PeopleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_people11
     *
     * @mbggenerated
     */
    int deleteByExample(PeopleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_people11
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_people11
     *
     * @mbggenerated
     */
    int insert(People record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_people11
     *
     * @mbggenerated
     */
    int insertSelective(People record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_people11
     *
     * @mbggenerated
     */
    List<People> selectByExample(PeopleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_people11
     *
     * @mbggenerated
     */
    People selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_people11
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") People record, @Param("example") PeopleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_people11
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") People record, @Param("example") PeopleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_people11
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(People record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_people11
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(People record);
}