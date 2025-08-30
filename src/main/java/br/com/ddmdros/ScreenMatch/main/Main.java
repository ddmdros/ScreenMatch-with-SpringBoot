package br.com.ddmdros.ScreenMatch.main;

import br.com.ddmdros.ScreenMatch.model.EpisodeData;
import br.com.ddmdros.ScreenMatch.model.SeasonData;
import br.com.ddmdros.ScreenMatch.model.SeriesData;
import br.com.ddmdros.ScreenMatch.service.ApiRequest;
import br.com.ddmdros.ScreenMatch.service.DataConverter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        var json = apiRequest.getData(OMDB_WEB_ADDRESS + serieName.replace(" ", "+") + API_KEY);
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

    }

}
