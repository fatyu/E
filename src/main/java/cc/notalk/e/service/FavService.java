package cc.notalk.e.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cc.notalk.e.domain.repository.FavRepository;

@Service
public class FavService {
    @Autowired
    FavRepository favRepository;

}
