package chat.bot.repository;

import chat.bot.models.ResponsePattern;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ResponsePatternRepository extends JpaRepository<ResponsePattern, UUID> {
}
