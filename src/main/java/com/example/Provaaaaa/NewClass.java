/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Provaaaaa;

import java.util.Enumeration;
import java.util.Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
class NewClass {
    
	@GetMapping
        @ResponseBody
	public String home() {
		Properties p = System.getProperties();
Enumeration keys = p.keys();
while (keys.hasMoreElements()) {
    String key = (String)keys.nextElement();
    String value = (String)p.get(key);
    System.out.println(key + ": " + value);
}
return "newhtml";
	}
}