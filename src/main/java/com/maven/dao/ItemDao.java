package com.maven.dao;

import com.maven.entity.Item;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ItemDao {
    @Select("select * from items where id=#{id]")
    public Item findItemById(@Param("id") String id);
}
