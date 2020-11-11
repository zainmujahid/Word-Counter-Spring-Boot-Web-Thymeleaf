package com.word_counter.web_application;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class Word_Counter_Controller {
    @GetMapping("/word_counter")
    public String word_counterForm(Model model) {
      model.addAttribute("word_counter", new Word_Counter());
      return "word_counter";
    }
  
    @PostMapping("/word_counter")
    public String word_counterSubmit(@ModelAttribute Word_Counter word_counter, Model model) {
      model.addAttribute("word_counter", word_counter);
      return "result";
    }

}