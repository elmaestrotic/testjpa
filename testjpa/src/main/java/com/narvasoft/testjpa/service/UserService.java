package com.narvasoft.testjpa.service;

import com.narvasoft.testjpa.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface UserService {
    public Iterable<User> findAll();
    public Page<User> findAll(Pageable pageable);
    public Optional<User> findById(Long id);
    public User save(User user);//guardar una entidad y devolverla
    public void deleteById(Long id);//para eliminar un user por id
}
