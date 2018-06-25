package graphqlsandbox.graphqlsandbox.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import graphqlsandbox.graphqlsandbox.model.Article;
import graphqlsandbox.graphqlsandbox.model.Comment;
import graphqlsandbox.graphqlsandbox.model.Profile;
import graphqlsandbox.graphqlsandbox.repository.ArticleRepository;
import graphqlsandbox.graphqlsandbox.repository.CommentRepository;
import graphqlsandbox.graphqlsandbox.repository.ProfileRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class QueryResolver implements GraphQLQueryResolver {
    private ArticleRepository articleRepository;
    private CommentRepository commentRepository;
    private ProfileRepository profileRepository;

    public List<Article> getArticles() {
        return articleRepository.findAll();
    }

    public List<Comment> getComments() {
        return commentRepository.findAll();
    }

    public List<Profile> getProfiles() {
        return profileRepository.findAll();
    }

    public Article getArticle(Long id) {
        return articleRepository.findById(id).get();
    }
}