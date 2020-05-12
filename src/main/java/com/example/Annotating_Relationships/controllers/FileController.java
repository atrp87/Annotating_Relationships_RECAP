package com.example.Annotating_Relationships.controllers;

import com.example.Annotating_Relationships.models.File;
import com.example.Annotating_Relationships.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Files;
import java.util.List;

@RestController
public class FileController {

    @Autowired
    FileRepository fileRepository;

    @GetMapping(value = "/files")
    public ResponseEntity<List<File>> getAllFiles() {
        List<File> foundFiles = fileRepository.findAll();
        return new ResponseEntity<List<File>>(foundFiles, HttpStatus.OK);
    }

    @GetMapping(value = "/files/{id}")
    public ResponseEntity getOneFile(@PathVariable Long id){
        return new ResponseEntity<>(fileRepository.findById(id), HttpStatus.OK);
    }
}


