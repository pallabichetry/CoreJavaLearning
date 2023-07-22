package com.pallabi.learn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class BuildingEvacuationReport {

    public static void main(String[] args) throws IOException, ParseException {

        BufferedReader fp = new BufferedReader(new
                FileReader("C:\\\\Users\\\\bhask\\\\Desktop\\\\employee_data.txt"));

        HashMap<String, String[]> empMap = new HashMap<>();

        while(true) {

            String str = fp.readLine();

            if(str == null) {
                break;
            }

            ArrayList<String> data = new ArrayList<>(List.of(str.split("\\|")));

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String employeeID = data.get(0);
            String timestamp = data.get(1);
            String status = data.get(2);
            //System.out.println(timestamp);
            String[] empData = empMap.get(employeeID);

            if (empData == null ){
                empMap.put(employeeID, new String[]{ timestamp,status});
            } else {
                if (format.parse(timestamp).after(format.parse(empData[0]))) {
                    empMap.put(employeeID, new String[]{timestamp,status});
                }
            }


        }

        empMap.forEach( (k,v) -> {

            if (v[1].toUpperCase().equals("IN")) {
                System.out.println(
                        "Employee id = " + k +
                                ", From Time = " + v[0]
                                + ", Status = " + v[1].toUpperCase()
                );

            }

        });

    }

}
