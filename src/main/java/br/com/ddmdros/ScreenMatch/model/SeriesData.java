package br.com.ddmdros.ScreenMatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record SeriesData(@JsonAlias("Title")String title,
                         Integer totalSeasons,
                         String imdbRating,
                         @JsonAlias("Plot") String plot) {

}
