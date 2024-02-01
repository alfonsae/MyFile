/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myfile;

/**
 *
 * @author dell
 */
public class Main {
	public static void main(String[] args) {
		MyFile myFile = new MyFile();
		String input = myFile.readTextFile("Testing.txt");
		System.out.println(input);
		myFile.writeTextFile("Testing2.txt", input);
	}
} 