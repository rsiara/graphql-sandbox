package graphqlsandbox.graphqlsandbox.repository;

import graphqlsandbox.graphqlsandbox.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
