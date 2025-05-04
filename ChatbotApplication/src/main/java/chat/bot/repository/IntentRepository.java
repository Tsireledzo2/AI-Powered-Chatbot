package chat.bot.repository;

import chat.bot.models.Intent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

import java.util.UUID;
@Repository
public interface IntentRepository extends JpaRepository<Intent, UUID> {
}
