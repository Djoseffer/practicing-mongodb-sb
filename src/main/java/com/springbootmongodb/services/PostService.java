package com.springbootmongodb.services;

import com.springbootmongodb.domain.Post;
import com.springbootmongodb.domain.User;
import com.springbootmongodb.dto.UserDTO;
import com.springbootmongodb.repositories.PostRepository;
import com.springbootmongodb.repositories.UserRepository;
import com.springbootmongodb.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post findById(String id) {
        Optional<Post> user = postRepository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text){
        return postRepository.findByTitleContainingIgnoreCase(text);
    }
}
