package com.moviedatabase.movienameservice.controller;


import com.moviedatabase.movienameservice.model.MovieName;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieNameController {

    @RequestMapping("/name")
    public MovieName getMovieName(){
        return new MovieName("Terminator");
    }

}
