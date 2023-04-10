package ir.bobby.bobbyblog.blogcodes.modules.posts.repository;

import ir.bobby.bobbyblog.blogcodes.modules.posts.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
