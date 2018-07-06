package com.pro.question.answer;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question004_part2 {

	
	
public static void main(String[] args) throws IOException {
		
		File file = new File("/home/controller/Desktop/demotest.txt");
		FileInputStream str = new FileInputStream(file);
		InputStreamReader reader = new InputStreamReader(str);
		BufferedReader buff = new BufferedReader(reader);
		StringBuilder sb = new StringBuilder();
		
		String line;
		int result=0;
		
		while((line=buff.readLine())!=null) {
			
			if(!isItValid(line)) {
				result=result+1;
			}
			
		}
		System.out.println(result);
		
	}

	private static boolean isItValid(String line) {
		
		boolean result=false;
		
		List<String> wordList= new ArrayList<String>();
		for(String str:line.split(" ")) {
			
			char c[]=str.toCharArray();
			Arrays.sort(c);
			String s="";
			for(int i=0;i<c.length;i++) {
				s=s+c[i];
			}
			wordList.add(s);
		}

		for(int i=0;i<wordList.size();i++) {
			for(int j=0;j<wordList.size();j++) {
				
				if(i!=j && wordList.get(i).equals(wordList.get(j))) {
					result=true;
				}
				
			}
		}
		
		
		return result;
	}
}
