package com.dio.bank.service;

import com.dio.bank.domain.model.User;

public interface IUserService {

    User findById(Long id);
    User create(User user);
}
