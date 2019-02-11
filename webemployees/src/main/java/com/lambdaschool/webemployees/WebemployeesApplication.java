package com.lambdaschool.webemployees;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebemployeesApplication
{

    static EmpList ourEmpList;
    static CountryList ourCountryList;
    public static void main(String[] args)
    {
        ourEmpList = new EmpList();
        ourCountryList = new CountryList();
        SpringApplication.run(WebemployeesApplication.class, args);
    }

}
