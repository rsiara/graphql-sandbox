package graphqlsandbox.graphqlsandbox.query;

import com.coxautodev.graphql.tools.GraphQLResolver;
import graphqlsandbox.graphqlsandbox.model.Article;
import graphqlsandbox.graphqlsandbox.model.Comment;
import graphqlsandbox.graphqlsandbox.model.Profile;
import graphqlsandbox.graphqlsandbox.repository.CommentRepository;
import graphqlsandbox.graphqlsandbox.repository.ProfileRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class ArticleResolver implements GraphQLResolver<Article> {

    private CommentRepository commentRepository;
    private ProfileRepository profileRepository;

    public Profile getAuthor(Article article) {
        return profileRepository.findById(article.getAuthorId()).get();
    }

    public List<Comment> getComments(Article article) {
        return commentRepository.findByArticleId(article.getId());
    }
}
