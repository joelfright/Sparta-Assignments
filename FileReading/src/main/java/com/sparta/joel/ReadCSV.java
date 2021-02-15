package com.sparta.joel;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class ReadCSV {

    private static final String employees = "src/resources/employees.csv";
    private static final ArrayList<Employee> employeesList = new ArrayList<>();

    public static void getData(){
        try(BufferedReader input = new BufferedReader(new FileReader(employees))){
            input.readLine();
            String line = input.readLine();
            while(line != null){
                String[] attributes = line.split(",");
                Employee e = new Employee(
                        attributes[0],
                        attributes[1],
                        attributes[2],
                        attributes[3],
                        attributes[4].charAt(0),
                        attributes[5].charAt(0),
                        attributes[6],
                        dateFormatter(attributes[7]),
                        dateFormatter(attributes[8]),
                        attributes[9]);
                employeesList.add(e);
                line = input.readLine();
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        for(Employee e : employeesList){
            System.out.println(e.toString());
        }
    }

    public static Date dateFormatter(String date){
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        try {
            return formatter.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

}
