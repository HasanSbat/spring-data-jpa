package com.example.demo.services;

import com.example.demo.model.Channel;
import com.example.demo.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.PostRepository;
import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public void createPost(Post post){
        postRepository.save(post);
    }
    public void editPost(Post post, Integer id){
        Post newPost= postRepository.findById(id).get();
        newPost.setId(id);
        postRepository.save(newPost);
    }
    public List<Post> getAllPostsByChannel(Channel channel){
        List<Post> channelPosts = new ArrayList<>();
        postRepository.findAll().forEach(post -> channelPosts.add(post));
        return channelPosts;
    }
   // public List<Post> replyOnPost(){ } hoe kan ik deze scrijven??

    public List<Post> getAllRepliesByPost(Post post){
    List<Post> repliesPosts = new ArrayList<>();
    postRepository.findAll().forEach(post1 -> repliesPosts.add(post));
    return repliesPosts;
    }
}
