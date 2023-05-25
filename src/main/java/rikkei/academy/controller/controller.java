package rikkei.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Locale;

@Controller
public class controller {
private int rate = 23000;
private double vnd;
    @RequestMapping(value = "/")
    public String home() {
        return "form_cdtt";
    }

    @RequestMapping(value = "/convert"  )
    public String value(@RequestParam("usd") double usd, ModelMap model, Model model1) {
        vnd = usd * rate;
        model.addAttribute("vnd", vnd);
        model1.addAttribute("usd", usd);
        return "chuyendoitiente";
    }
}
