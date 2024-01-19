package edu.greenriver.sdev.jokesdad.db;

import edu.greenriver.sdev.jokesdad.model.DadJoke;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DadJokeRepository extends JpaRepository<DadJoke, Integer> {
}
