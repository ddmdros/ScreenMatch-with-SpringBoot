package br.com.ddmdros.ScreenMatch.main;

import br.com.ddmdros.ScreenMatch.model.EpisodeData;
import br.com.ddmdros.ScreenMatch.model.Episode;
import br.com.ddmdros.ScreenMatch.model.SeasonData;
import br.com.ddmdros.ScreenMatch.model.SeriesData;
import br.com.ddmdros.ScreenMatch.service.ApiRequest;
import br.com.ddmdros.ScreenMatch.service.DataConverter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private Scanner scanner = new Scanner(System.in);

    private ApiRequest apiRequest = new ApiRequest();
    private DataConverter converter = new DataConverter();

    private final String OMDB_WEB_ADDRESS = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=6585022c";

    List<SeasonData> seasons = new ArrayList<>();

    public void showMenu(){
        System.out.println("Type the Series name to search for it: ");
        var serieName = scanner.nextLine();
        var json = apiRequest.getData(OMDB_WEB_ADDRESS
                + serieName.replace(" ", "+") + API_KEY);
        SeriesData data = converter.getData(json,SeriesData.class);
        System.out.println(data);

        for (int i = 1; i <= data.totalSeasons(); i++){
            json = apiRequest.getData
                    (OMDB_WEB_ADDRESS + serieName.replace(" ", "+") + "&season=" + i + API_KEY);
            SeasonData seasonData = converter.getData(json, SeasonData.class);
            seasons.add(seasonData);
        }
        seasons.forEach(System.out::println);

        seasons.forEach(s -> s.episodes().forEach(t -> System.out.println(t.title())));

        List<EpisodeData> episodesData = seasons.stream()
                .flatMap(t -> t.episodes()
                        .stream()).collect(Collectors.toList());
//
//        System.out.println("Top 5 episodes");
//        episodesData.stream()
//                .filter(e -> !e.rating().equalsIgnoreCase("N/A"))
//                .sorted(Comparator.comparing(EpisodeData::rating).reversed())
//                .map(e -> e.title().toUpperCase())
//                .limit(10)
//                .forEach(System.out::println);

        List <Episode> episodes = seasons.stream()
                .flatMap(s -> s.episodes().stream()
                        .map(e -> new Episode(s.season(), e)))
                .collect(Collectors.toUnmodifiableList());

        episodes.forEach(System.out::println);

//        System.out.println("Type an episode title snippet: ");
//        var parcialTitle = scanner.nextLine();
//        Optional<Episode> searchedEpisode = episodes.stream()
//                .filter(e -> e.getTitle().toUpperCase().contains(parcialTitle.toUpperCase()))
//                .findFirst();
//        if(searchedEpisode.isPresent()){
//            System.out.println("Episode found.");
//            System.out.println("Season: " + searchedEpisode.get().getSeason());
//        } else {
//            System.out.println("Episode not found.");
//        }

//        System.out.println("A partir de que ano você deseja ver os episódios? ");
//        var year = scanner.nextInt();
//        scanner.nextLine();
//
//        LocalDate searchDate = LocalDate.of(year,1,1);
//
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//
//        episodes.stream()
//                .filter(e -> e.getReleaseDate() != null
//                        && e.getReleaseDate().isAfter(searchDate)).forEach(e -> System.out.println(
//                                "Season: " + e.getSeason()
//                                        + " Episode: " + e.getTitle()
//                                        + " Release Date: " + e.getReleaseDate().format(df)
//                ));
//
        Map<Integer, Double> ratingsPerSeason = episodes.stream()
                .filter(e -> e.getRating() > 0.0)
                .collect(Collectors.groupingBy(Episode::getSeason,
                        Collectors.averagingDouble(Episode::getRating)));

        System.out.println(ratingsPerSeason);

        DoubleSummaryStatistics est = episodes.stream()
                .filter(e->e.getRating() > 0.0)
                .collect(Collectors.summarizingDouble(Episode::getRating));
        System.out.println("Average rating: " + est.getAverage());
        System.out.println("Worst rating: " + est.getMin());
        System.out.println("Best rating: " + est.getMax());
        System.out.println("Amount: " + est.getCount());


    }

}
