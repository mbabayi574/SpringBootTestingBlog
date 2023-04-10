package ir.bobby.bobbyblog.blogcodes.modules.posts.repository;

import ir.bobby.bobbyblog.blogcodes.modules.posts.model.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostsRepository extends JpaRepository<Posts, Long> {

}
