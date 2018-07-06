package com.pro.question.answer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Question005 {

	public static void main(String[] args) throws IOException {

		/// Users/allah.rakha/Desktop
		File file = new File("/Users/allah.rakha/Desktop/demo.txt");
		FileInputStream fileStream = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(fileStream);
		BufferedReader reader = new BufferedReader(input);

		String line;
		StringBuilder sb = new StringBuilder();

		int count = 0;
		int lineNum=0;
		while ((line = reader.readLine()) != null) {
			lineNum++;

			List<String> wordList = new ArrayList<>();
			for (String s : line.split(" ")) {

				wordList.add(s);

			}
			System.out.println(wordList);
			boolean b = false;
			for (int i = 0; i < wordList.size(); i++) {
				for (int j = 0; j < wordList.size(); j++) {
					if (i != j && wordList.get(i).equals(wordList.get(j))) {
						b=true;
					}else {
						
					}

				}
				if (b) {
					count++;
					b = false;
				}

			}

		}

		int total=lineNum-count;
		System.out.println(total);
		//System.out.println("Line Number"+lineNum);

	}

}
