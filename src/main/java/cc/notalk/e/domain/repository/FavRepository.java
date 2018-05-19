package cc.notalk.e.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cc.notalk.e.domain.entity.Fav;

public interface FavRepository extends JpaRepository<Fav, String> {

}