package br.com.ddmdros.ScreenMatch;

import br.com.ddmdros.ScreenMatch.model.SeriesData;
import br.com.ddmdros.ScreenMatch.service.ApiRequests;
import br.com.ddmdros.ScreenMatch.service.DataConverter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenMatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenMatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("First non-Web Spring project");
		var apiRequests = new ApiRequests();
		var json = apiRequests.getData("https://www.omdbapi.com/?t=gilmore+girls&apikey=1a827399");
		System.out.println(json);
		DataConverter converter = new DataConverter();
		SeriesData data = converter.getData(json,SeriesData.class);
		System.out.println(data);


	}
}
