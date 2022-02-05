package com.codepresso.blog.repository;

import com.codepresso.blog.vo.UserComment;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface UserCommentRepository {
    void registerComment(@Param("userComment") UserComment userComment);
    List<UserComment> findAllComment(@Param("id") Integer id);
}
