package br.com.ddmdros.ScreenMatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record EpisodeData(@JsonAlias("Title") String title,
                          @JsonAlias("Episode") Integer episode,
                          @JsonAlias("imdbRating") String rating,
                          @JsonAlias("Released") String releaseDate)
                          //@JsonAlias("Plot") String plot)
                          {

}
