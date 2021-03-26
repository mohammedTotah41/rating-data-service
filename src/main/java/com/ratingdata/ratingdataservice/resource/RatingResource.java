package com.ratingdata.ratingdataservice.resource;

import com.ratingdata.ratingdataservice.models.Rating;
import com.ratingdata.ratingdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingData")
public class RatingResource {

    @RequestMapping("/{movieId}")
    public Rating getRatings(@PathVariable String movieId){
        return new Rating(movieId,4);
    }

    @RequestMapping("/user/{userId}")
    public UserRating getRatingsByUserId(@PathVariable("userId") String userId){
        List<Rating> ratingList =  Arrays.asList(
                new Rating("100" , 3),
                new Rating("120" , 5),
                new Rating("150" , 4)
        );

        UserRating userRating = new UserRating();
        userRating.setRatings(ratingList);
        userRating.setUserId(1);
        return userRating;
    }
}
