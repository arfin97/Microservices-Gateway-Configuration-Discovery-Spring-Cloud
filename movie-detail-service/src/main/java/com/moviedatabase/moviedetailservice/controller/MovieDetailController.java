package com.moviedatabase.moviedetailservice.controller;

import com.moviedatabase.moviedetailservice.models.MovieDetail;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieDetailController {

    @RequestMapping("/detail")
    public MovieDetail getMovieDetail(){
        return new MovieDetail("American science fiction action film produced and directed by James Cameron");
    }
}
