/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.segways.segways.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author aradh
 */

@Controller
public class SegwaysController {
    @RequestMapping("/home")
    public String run(){
        return "test";
    }
    
   
    @RequestMapping("/contact_us")
    public String contact(){
        return "contact";
    }

    @RequestMapping("driver_login")
    public String DriverLogin(){
        return "driverlogin";
    }
    
    @RequestMapping("customer_login")
    public String CustomerLogin(){
        return "customerlogin";
    }

    @RequestMapping("driver_signup")
    public String DriverSignup(){
        return "driversignup";
    }

    @RequestMapping("customer_signup")
    public String CustomerSignup(){
        return "customersignup";
    }



    // Customer Home page Mapping

}
