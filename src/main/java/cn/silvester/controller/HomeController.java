package cn.silvester.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lpf on 2017/3/13.
 */
@Controller
@RequestMapping(value = "home")
public class HomeController {
    @GetMapping
    public String home(Model model){
        model.addAttribute("hello","hello world");
        return "login";
    }
//    @GetMapping("rest")
//    public ResponseEntity<String> rest(){
//        return new ResponseEntity<String>("")
//    }
}
