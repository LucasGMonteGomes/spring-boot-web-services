package com.krd.services;

import com.krd.entities.User;
import com.krd.repositories.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.autoconfigure.JspTemplateAvailabilityProvider;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRespository userRespository;

    public List<User> findAll() {
        return userRespository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = userRespository.findById(id);
        return obj.get();
    }

    public User insert(User obj) {
        return userRespository.save(obj);
    }

    public void delete(Long id) {
        userRespository.deleteById(id);
    }

    public User update(Long id, User obj) {
        User entity = userRespository.getReferenceById(id);
        updateData(entity, obj);
        return userRespository.save(entity);
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
