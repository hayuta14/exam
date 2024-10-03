package com.example.cruddemo.entity;

import com.example.cruddemo.entity.National;
import com.example.cruddemo.service.PlayerService;
import jakarta.persistence.*;

@Entity
@Table(name = "player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id")
    private Integer playerId;

    @ManyToOne
    @JoinColumn(name = "national_id", referencedColumnName = "national_id")
    private National national;

    @Column(name = "player_name", nullable = false, length = 100)
    private String playerName;

    @Column(name = "high_score", nullable = false)
    private Integer highScore;

    @Column(name = "level", nullable = false)
    private Integer level;

    public Player(){

    }
    public Player(Integer level, String playerName, Integer highScore, National national) {
        this.level = level;
        this.playerName = playerName;
        this.highScore = highScore;
        this.national = national;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", national=" + national +
                ", playerName='" + playerName + '\'' +
                ", highScore=" + highScore +
                ", level=" + level +
                '}';
    }

// Getters and Setters

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public National getNational() {
        return national;
    }

    public void setNational(National national) {
        this.national = national;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Integer getHighScore() {
        return highScore;
    }

    public void setHighScore(Integer highScore) {
        this.highScore = highScore;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
