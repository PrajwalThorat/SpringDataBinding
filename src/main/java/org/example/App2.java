package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;

public class App2 {
    public static void main(String[] args) {
        try{
            Student student=new Student();
            student.setId(801);
            student.setFirstName("William");
            student.setLastName("Bela");
            student.setCity("Texas");

            ObjectMapper object=new ObjectMapper();
            object.enable(SerializationFeature.INDENT_OUTPUT);
            object.writeValue(new File("E://sample-output.json"), student);
            System.out.println("It got stored in File");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
