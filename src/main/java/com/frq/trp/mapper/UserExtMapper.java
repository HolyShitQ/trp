package com.frq.trp.mapper;

import com.frq.trp.model.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserExtMapper {

    @Select("select * from user")
    List<User> getAllUser();
}
