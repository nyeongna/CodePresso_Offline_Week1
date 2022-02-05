package com.codepresso.blog.service;

import com.codepresso.blog.vo.Post;

import java.util.List;

public interface PostService {
    void registerPost(Post post);
    List<Post> findAll(Integer id);
    void modifyPost(Post post);
    void deletePost(Integer id);
}
