package graphqlsandbox.graphqlsandbox.repository;

import graphqlsandbox.graphqlsandbox.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}
