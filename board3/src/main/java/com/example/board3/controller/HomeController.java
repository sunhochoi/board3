package com.example.board3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

  @GetMapping("/")
  public String index (){
    //return "index";
    return "loginA";
  }

  @GetMapping("/home")
  public String home (){
    return "home";
  }


  @GetMapping("/joinMember")
  public String joingMember (){


    return "joinMember";
  }

  @GetMapping("/loginA")
  public String loginA (){


    return "loginA";
  }

  @PostMapping("/loginB")
  public String loginB (HttpServletRequest request){
    String userId = request.getParameter("userId");

    String pwd = request.getParameter("userPwd");
    System.err.println("userId " + userId);
    System.err.println("pwd " + pwd);

    return "loginB";
  }

}
