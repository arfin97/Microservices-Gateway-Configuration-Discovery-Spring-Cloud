package com.moviedatabase.movieservice.controller;

import com.moviedatabase.movieservice.model.Movie;
import com.moviedatabase.movieservice.model.MovieDetail;
import com.moviedatabase.movieservice.model.MovieName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/movie")
    public Movie getMovie(){
        MovieName movieName = restTemplate.getForObject("http://movie-name-service/name", MovieName.class);
        MovieDetail movieDetail = restTemplate.getForObject("http://movie-detail-service/detail", MovieDetail.class);
        return new Movie(movieName.getName(), movieDetail.getMovieDetail());
    }
}
