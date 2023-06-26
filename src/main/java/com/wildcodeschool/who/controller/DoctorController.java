package com.wildcodeschool.who.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class DoctorController {
    @GetMapping("/doctor/1")
    @ResponseBody()
    public String getWilliam() {
        return "William Hartnell <br> <img src='https://flxt.tmsimg.com/assets/76723_v9_ba.jpg' width=400px>";
    }
    @GetMapping("/doctor/10")
    @ResponseBody()
    public String getDavid() {
        return "David Tennant <br> <img src='https://upload.wikimedia.org/wikipedia/en/thumb/2/29/Fourteenth_Doctor_%28Doctor_Who%29.jpg/220px-Fourteenth_Doctor_%28Doctor_Who%29.jpg' width=400px>";
    }
    @GetMapping("/doctor/13")
    @ResponseBody()
    public String getJodie() {
        return "Jodie Whittaker <br> <img src='https://img.20mn.fr/TZ6RgmKFQCm-fxgXXERJ1Q/1200x768_jodie-whittaker-13e-incarnation-doctor-who' width=400px>";
    }


}
