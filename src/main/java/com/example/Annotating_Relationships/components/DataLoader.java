package com.example.Annotating_Relationships.components;

import org.apache.catalina.User;
import com.example.Annotating_Relationships.models.File;
import com.example.Annotating_Relationships.models.Folder;
import com.example.Annotating_Relationships.models.User;
import com.example.Annotating_Relationships.repositories.FileRepository;
import com.example.Annotating_Relationships.repositories.FolderRepository;
import com.example.Annotating_Relationships.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;


    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        User jeff = new User("Jeff");
        userRepository.save(jeff);

        File file1 = new Folder("Ruby", "txt", 32, folder1);
        fileRepository.save(file1);

        Folder folder1 = new Folder("PDA", "Jeff");
        folderRepository.save(folder1);

        jeff.addFolder(folder1);
        userRepository.save(jeff);
        folder1.addFile(file1);
        folderRepository.save(folder1);

    }
}