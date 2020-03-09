package com.gzwl.dao;

import com.gzwl.pojo.ShoppingTrolley;
import com.gzwl.pojo.ShoppingTrolleyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShoppingTrolleyMapper {
    int countByExample(ShoppingTrolleyExample example);

    int deleteByExample(ShoppingTrolleyExample example);

    int deleteByPrimaryKey(Integer shoppingTrolleyId);

    int insert(ShoppingTrolley record);

    int insertSelective(ShoppingTrolley record);

    List<ShoppingTrolley> selectByExample(ShoppingTrolleyExample example);

    ShoppingTrolley selectByPrimaryKey(Integer shoppingTrolleyId);

    int updateByExampleSelective(@Param("record") ShoppingTrolley record, @Param("example") ShoppingTrolleyExample example);

    int updateByExample(@Param("record") ShoppingTrolley record, @Param("example") ShoppingTrolleyExample example);

    int updateByPrimaryKeySelective(ShoppingTrolley record);

    int updateByPrimaryKey(ShoppingTrolley record);
}