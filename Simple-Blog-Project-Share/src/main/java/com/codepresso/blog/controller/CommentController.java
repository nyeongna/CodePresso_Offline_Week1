package com.codepresso.blog.controller;

import com.codepresso.blog.service.CommentService;
import com.codepresso.blog.vo.Post;
import com.codepresso.blog.vo.Result;
import com.codepresso.blog.vo.UserComment;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

    @PostMapping(value = "/comment")
    public Result registerPost(@RequestBody UserComment userComment) {
        commentService.registerComment(userComment);
        return new Result(200, "Ok");
    }

    @GetMapping(value = "/comment")
    public List<UserComment> findAllComment(@RequestParam(name="post_id") Integer id) {
        return commentService.findAllComment(id);
    }


}
