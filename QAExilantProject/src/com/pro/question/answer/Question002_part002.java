package com.pro.question.answer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question002_part002 {
	
	public static void main(String[] args) throws IOException {
		
		
		File file = new File("/Users/allah.rakha/Desktop/testCsv.csv");
		FileInputStream fileStream = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(fileStream);
		BufferedReader reader = new BufferedReader(input);
		
		String line;
		StringBuilder sb = new StringBuilder();
		int result=0;
		int total=0;
		while ((line = reader.readLine()) != null) {
			
			System.out.println(line);
			
			List<Integer> numList= new ArrayList<>();
			for(String s:line.split(" ")) {
				numList.add(Integer.parseInt(s));
			}
			total=total+totalFromLine(numList);
			System.out.println(total);
			
		}
		
	}

	private static int totalFromLine(List<Integer> numList) {
		int sum=0;
		Collections.sort(numList);
		for(int i=0;i<numList.size();i++) {
			
			for(int j=0;j<numList.size();j++) {
				if(numList.get(j)%numList.get(i)==0 && i!=j) {
					sum=(numList.get(j)/numList.get(i));
					break;
			}
				
			}
			
		}
	
		return sum;
	}

}
