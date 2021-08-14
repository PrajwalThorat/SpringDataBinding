package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class App
{
    public static void main( String[] args )
    {
        ObjectMapper obj=new ObjectMapper();
        Student student=null;

        try{

            student=obj.readValue(new File("E://sample.json"), Student.class);
        }catch(Exception e){
            System.out.println(e);
        }

        System.out.println(student);
    }
}
