package dev.practice.crud.post;

import org.springframework.stereotype.Service;

import java.util.List;

public interface PostService {
    void createPost(PostDto dto);
    List<PostDto> readPostAll();
    PostDto readPost(int id);
    void updatePost(int id, PostDto dto);
    void deletePost(int id);
}
