package com.ults.ideathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ults.ideathon.model.ReviewerComment;

public interface ReviewerRepository extends JpaRepository<ReviewerComment, Integer>{


}
