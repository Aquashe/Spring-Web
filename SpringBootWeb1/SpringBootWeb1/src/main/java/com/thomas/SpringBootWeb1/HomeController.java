package com.thomas.SpringBootWeb1;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.net.http.HttpRequest;

@Controller
public class HomeController {
    @RequestMapping("/")
    public  String  home(){
        System.out.println("Home method called");
        return "index";
    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int a , @RequestParam("num2") int num2, ModelAndView mv){
/*
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        session.setAttribute("result",result);
*/

/*
    //Intially we were seperatelly using the model and view
    int result = a+num2;
    model.addAttribute("result",result);
    return "result";
 */
     mv.addObject("result",a+num2);
     mv.setViewName("result");
     return mv;
    }

    /*
    @RequestMapping("addAlien")
    public  ModelAndView addAlien(@RequestParam("aid")int  aid,@RequestParam("aname")String aname,ModelAndView mv){

        Alien alien = new Alien();
        alien.setAid(aid);
        alien.setAname(aname);
        mv.addObject("alien",alien);
        mv.setViewName("result");
        return mv;
    }
    */

    @RequestMapping("addAlien")
    public  String addAlien(@ModelAttribute("alien1") Alien alien){

        return "result";
    }
    @ModelAttribute("course")
    public  String courseName(){
        return  "java";
    }


}
