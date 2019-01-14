/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pridesys.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author LENOVO
 */
@Controller 
public class ReportController {
    @RequestMapping("/index")
    String index (){
        System.out.println("Hello");
        return "index";
    }
    
}
