package com.mxcst.classic.mapper;

import com.mxcst.classic.entity.AccountBanned;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AccountBannedMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_banned
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("id") Integer id, @Param("bandate") Long bandate);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_banned
     *
     * @mbg.generated
     */
    int insert(AccountBanned record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_banned
     *
     * @mbg.generated
     */
    int insertSelective(AccountBanned record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_banned
     *
     * @mbg.generated
     */
    AccountBanned selectByPrimaryKey(@Param("id") Integer id, @Param("bandate") Long bandate);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_banned
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(AccountBanned record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_banned
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(AccountBanned record);
}