package com.example.demo.repository;

import com.example.demo.model.Subredddit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubredditRepository extends JpaRepository<Subredddit, Long> {
}
