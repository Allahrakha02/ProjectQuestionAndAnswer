package com.pro.question.answer;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class Question004_part001 {
public static void main(String[] args) throws IOException {
		
		File file = new File("/home/controller/Desktop/demotest.txt");
		FileInputStream str = new FileInputStream(file);
		InputStreamReader reader = new InputStreamReader(str);
		BufferedReader buff = new BufferedReader(reader);
		StringBuilder sb = new StringBuilder();
		
		String line;
		int result=0;
		int numOfLine=0;
		
		while((line=buff.readLine())!=null) {
			
			if(!isItValid(line)) {
				result=result+1;
			}
			
			//numOfLine++;
		}
		//result=numOfLine-result;
		System.out.println(result);
		
	}

	private static boolean isItValid(String line) {
		
		boolean result=false;
		
		List<String> wordList= new ArrayList<String>();
		for(String s:line.split(" ")) {
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
