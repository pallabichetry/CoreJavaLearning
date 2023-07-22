package com.pallabi.learn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ReadingFile {
    public static void main(String[] args) throws IOException {
        // Step 1 Read File
        FileReader fr = new FileReader("C:\\Users\\bhask\\Desktop\\devansh.txt");
        BufferedReader br = new BufferedReader(fr);

        String str;

        int count = 0;
        HashMap<String,Integer> wordMap = new HashMap<>();

        while ((str = br.readLine())!= null){

            ArrayList<String> strList = new ArrayList<String>(List.of(str.split(" ")));

            for (String word:strList) {
                if(wordMap.get(word)==null){
                    wordMap.put(word,1);
                }else{
                    int val = wordMap.get(word)+1;
                    wordMap.put(word,val);
                }

            }

        }

        System.out.println(wordMap);

        br.close();

    }



}
