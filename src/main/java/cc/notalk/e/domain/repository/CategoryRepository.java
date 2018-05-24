package cc.notalk.e.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cc.notalk.e.domain.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
