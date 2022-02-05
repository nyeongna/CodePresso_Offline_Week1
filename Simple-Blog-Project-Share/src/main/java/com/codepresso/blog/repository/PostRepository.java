package com.codepresso.blog.repository;

import com.codepresso.blog.vo.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface PostRepository {

    void registerPost(@Param("post") Post post);
    List<Post> findAll(@Param("id") Integer id);
    void modifyPost(@Param("post") Post post);
}
