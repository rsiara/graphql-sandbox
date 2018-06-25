package graphqlsandbox.graphqlsandbox.query;

import com.coxautodev.graphql.tools.GraphQLResolver;
import graphqlsandbox.graphqlsandbox.model.Comment;
import graphqlsandbox.graphqlsandbox.model.Profile;
import graphqlsandbox.graphqlsandbox.repository.ProfileRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CommentResolver implements GraphQLResolver<Comment> {
    private ProfileRepository profileRepository;

    public Profile getAuthor(Comment comment) {
        return profileRepository.findById(comment.getAuthorId()).get();
    }
}