package com.example.Annotating_Relationships.repositories;

import com.example.Annotating_Relationships.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
