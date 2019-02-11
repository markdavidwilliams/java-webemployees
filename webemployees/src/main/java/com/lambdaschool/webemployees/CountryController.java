package com.lambdaschool.webemployees;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/data")
public class CountryController
{
    @RequestMapping("/allcountries")
    public ArrayList<Country> getAllCountries() {
        return WebemployeesApplication.ourCountryList.countryList;
    }
}
