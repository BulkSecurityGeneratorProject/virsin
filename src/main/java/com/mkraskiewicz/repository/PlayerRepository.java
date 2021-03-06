package com.mkraskiewicz.repository;

import com.mkraskiewicz.domain.Player;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.Optional;


/**
 * Spring Data  repository for the Player entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

    Optional<Player> findByUserId(Long id);

}
