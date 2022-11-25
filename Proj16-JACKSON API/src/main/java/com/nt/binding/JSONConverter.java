package com.nt.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONConverter 
{
    public static void main( String[] args ) throws Exception
    {
       Student st = new Student();
       st.setId(101);
       st.setName("Shashank");
       st.setRank(1102);
       
       ObjectMapper mapper = new ObjectMapper();
       mapper.writeValue(new File("student.json"), st);
       System.out.println("JSON File Successfully Created..!");
    }
}
