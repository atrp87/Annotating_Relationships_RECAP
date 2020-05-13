package com.example.Annotating_Relationships;

import com.example.Annotating_Relationships.models.File;
import com.example.Annotating_Relationships.models.Folder;
import com.example.Annotating_Relationships.repositories.FileRepository;
import com.example.Annotating_Relationships.repositories.FolderRepository;
import com.example.Annotating_Relationships.repositories.UserRepository;
import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AnnotatingRelationshipsApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private FileRepository fileRepository;

	@Autowired
	private FolderRepository folderRepository;

	@Autowired
	private UserRepository userRepository;

	@Test
	public void canCreateAndSavePirateThatHasAShip() {

		User user = new User("Jeff");
		userRepository.save(user);

		Folder folder;
		folder = new folder("folder1");
		folderRepository.save(folder);

		File file = new File("file1", "txt", 32, folder1);
		fileRepository.save(file);

		file.addUser(user);
		fileRepository.save(file);

	}

}
