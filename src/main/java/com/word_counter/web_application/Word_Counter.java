package com.word_counter.web_application;

public class Word_Counter {

    private String content;
  
    public String getContent() {
      return content;
    }
  
    public void setContent(String content) {
      String[] words = content.split("\\s+"); // Tokenization
      String string = String.valueOf(words.length); // Counting the words and converting into string
      this.content = string; 
    }
  
  }