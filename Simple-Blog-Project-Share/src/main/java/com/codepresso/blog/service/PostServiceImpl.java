package com.codepresso.blog.service;

import com.codepresso.blog.repository.PostRepository;
import com.codepresso.blog.vo.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Override
    public void registerPost(Post post) {
        postRepository.registerPost(post);
    }

    @Override
    public List<Post> findAll(Integer id) {
        return postRepository.findAll(id);
    }

    @Override
    public void modifyPost(Post post) {
        postRepository.modifyPost(post);
    }
}
