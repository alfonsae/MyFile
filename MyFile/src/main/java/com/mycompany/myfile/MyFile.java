/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.myfile;

/**
 *
 * @author dell
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFile {

	public String readTextFile(String fileName) {
		String returnValue = "";
		FileReader file;
		String line = "";
		try {
			file = new FileReader(fileName);
			BufferedReader reader = new BufferedReader(file);
			while ((line = reader.readLine()) != null) {
				returnValue += line + "\n";
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException("File not found");
		} catch (IOException e) {
			throw new RuntimeException("IO Error occured");
		}
		return returnValue;

	}

	public void writeTextFile(String fileName, String s) {
		FileWriter output;
                try {
			output = new FileWriter(fileName);
			BufferedWriter writer = new BufferedWriter(output);
			writer.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}