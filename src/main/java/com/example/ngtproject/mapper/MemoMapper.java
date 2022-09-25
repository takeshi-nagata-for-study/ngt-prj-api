package com.example.ngtproject.mapper;

import com.example.ngtproject.model.Memo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface MemoMapper {

    @Insert("INSERT INTO memo (title, content, created_at) values (#{item.title}, #{item.content}, #{item.createdAt})")
    public void insert(@Param("item") final Memo memo);

}
