package com.example.start.repository;

import com.example.start.domain.Board;
import com.example.start.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaBoardRepository extends JpaRepository<Board, Long>, BoardRepository {
    @Override
    Optional<Board> findByName(String name);
}
