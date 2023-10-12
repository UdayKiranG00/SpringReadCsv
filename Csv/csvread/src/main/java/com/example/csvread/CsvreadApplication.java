package com.example.csvread;

import java.io.FileReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.opencsv.CSVReader;

@SpringBootApplication
public class CsvreadApplication {

	static
	CsvRepository csvRepo;
	
	public CsvreadApplication(CsvRepository csvRepo) {
		CsvreadApplication.csvRepo=csvRepo;
	}
	public static void main(String[] args) {
		SpringApplication.run(CsvreadApplication.class, args);
		System.out.println("hi");
		try(CSVReader reader=new CSVReader(new FileReader("src/main/resources/user.csv"))){
			String[] nextLine=null;
			System.out.println("NEXT");
			while((nextLine=reader.readNext())!=null) {
				Users u =new Users();
				u.setId(Integer.parseInt(nextLine[0]));
				System.out.println("id is : "+nextLine[0]);
				u.setName(nextLine[1]);
				u.setAge(Integer.parseInt(nextLine[2]));
				csvRepo.save(u);
			}
		}
		catch(Exception e) {
			
		}
	}

}
