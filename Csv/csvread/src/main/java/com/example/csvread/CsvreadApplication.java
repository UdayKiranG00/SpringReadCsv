package com.example.csvread;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CsvreadApplication {

//	static
//	CsvRepository csvRepo;
//	
//	public CsvreadApplication(CsvRepository csvRepo) {
//		CsvreadApplication.csvRepo=csvRepo;
//	}
	public static void main(String[] args) {
		SpringApplication.run(CsvreadApplication.class, args);
//		try(CSVReader reader=new CSVReader(new FileReader("src/main/resources/user.csv"))){
//			String[] nextLine=null;
//			while((nextLine=reader.readNext())!=null) {
//				Users u =new Users();
//				u.setId(Integer.parseInt(nextLine[0]));
//				u.setName(nextLine[1]);
//				u.setAge(Integer.parseInt(nextLine[2]));
//				csvRepo.save(u);
//			}
//		}
//		catch(Exception e) {
//			
//		}
	}

}
