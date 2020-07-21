package com.itech2;


import com.itech.CountryFounder;

import java.io.IOException;
import java.util.Scanner;
    public class TestMain {

        public static void main(String[] args) throws IOException {
            Scanner scanner = new Scanner(System.in);
            CountryFounder countryFinder = new CountryFounder();
            System.out.println("Enter CountryCode");
            String countryCode = scanner.next();
            System.out.println(countryFinder.findCountry(countryCode));
        }
    }

