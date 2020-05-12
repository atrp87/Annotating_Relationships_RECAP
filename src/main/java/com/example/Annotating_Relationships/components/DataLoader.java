package com.example.Annotating_Relationships.components;

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
        u;

        Folder folder = new Folder("folder", jeff);
        folderRepository.save(folder);

        File dump = new File("dump1", "txt", 24, folder);
        fileRepository.save(dump);

        folder.addFile(dump);
        jeff.addFolder

        // Refer type S

    }
}