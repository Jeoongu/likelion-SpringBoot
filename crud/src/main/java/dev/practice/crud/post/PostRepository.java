package dev.practice.crud.post;

import org.springframework.stereotype.Repository;

import java.util.List;

public interface PostRepository {
    boolean save(PostDto dto);
    List<PostDto> findAll();
    PostDto findById(int id);
    boolean delete(int id);
    boolean update(int id, PostDto dto);
}
