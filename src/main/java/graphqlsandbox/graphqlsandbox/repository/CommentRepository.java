package graphqlsandbox.graphqlsandbox.repository;

import graphqlsandbox.graphqlsandbox.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List findByArticleId(Long articleId);
}
