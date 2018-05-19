package cc.notalk.e.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cc.notalk.e.domain.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

}
