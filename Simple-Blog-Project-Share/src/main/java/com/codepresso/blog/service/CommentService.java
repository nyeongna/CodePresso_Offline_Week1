package com.codepresso.blog.service;

import com.codepresso.blog.repository.UserCommentRepository;
import com.codepresso.blog.vo.UserComment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final UserCommentRepository userCommentRepository;

    public void registerComment(UserComment userComment) {
        userCommentRepository.registerComment(userComment);
    }
    public List<UserComment> findAllComment(Integer id) {
        return userCommentRepository.findAllComment(id);
    }

}
