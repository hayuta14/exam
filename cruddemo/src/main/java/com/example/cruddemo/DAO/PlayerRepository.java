package com.example.cruddemo.DAO;

import com.example.cruddemo.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player,Integer> {
    @Query("SELECT p.playerId, p.playerName, p.highScore, p.level, n.nationalName FROM Player p JOIN p.national n")
    List<Player> showAllPlayer();
    @Query("SELECT p FROM Player p WHERE p.playerName = :playerName")
    List<Player> searchPlayerByName(@Param("playerName")String playerName);

    @Query("SELECT p FROM Player p ORDER BY p.highScore DESC")
    List<Player> top10Player();
}
