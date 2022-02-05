package com.codepresso.blog.controller;

import com.codepresso.blog.service.PostService;
import com.codepresso.blog.vo.Post;
import com.codepresso.blog.vo.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @PostMapping(value = "/posts")
    public Result registerPost(@RequestBody Post post) {
        postService.registerPost(post);

        return new Result(200, "Success");
    }

    @GetMapping(value = "/posts")
    public List<Post> findAll(@RequestParam(name = "id",required = false) Integer id){
        return postService.findAll(id);
    }

    @PutMapping(value = "/posts")
    public Result modifyPost(@RequestBody Post post){
        postService.modifyPost(post);

        return new Result(200, "Success");
    }

}
