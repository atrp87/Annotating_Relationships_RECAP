package com.example.Annotating_Relationships.repositories;

import com.example.Annotating_Relationships.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
