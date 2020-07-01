/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Provaaaaa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
class NewClass {
        @Value("${OPENSHIFT_MYSQL_DB_HOST}")
        private String myVariable;
    
	@GetMapping
        @ResponseBody
	public String home() {
		return "newhtml" + myVariable;
	}
}