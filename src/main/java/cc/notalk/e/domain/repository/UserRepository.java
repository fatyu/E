package cc.notalk.e.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cc.notalk.e.domain.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

}