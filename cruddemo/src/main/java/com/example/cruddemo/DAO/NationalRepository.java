package com.example.cruddemo.DAO;

import com.example.cruddemo.entity.National;
import com.example.cruddemo.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NationalRepository extends JpaRepository<National,Integer> {
    
}

