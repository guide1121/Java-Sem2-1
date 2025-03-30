//Name:Naphat Phoruang
//ID:6787021
//Section:1

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

public class MovieCatalog {
	
	private List<Movie> movies = null;
	
	MovieCatalog()
	{
		movies = new ArrayList<Movie>();
	}
	
	public List<Movie> getAllMovies()
	{
		return movies;
	}
	
	public void loadMovies(String filename)
	{
		
		//********************* YOUR CODE HERE **************************//

		try (CSVParser csvParser = new CSVParser(new FileReader(filename), CSVFormat.DEFAULT.withFirstRecordAsHeader())) {

			List<CSVRecord> records = csvParser.getRecords();
			for(CSVRecord record : records) {
				movies.add(new Movie(record.get(0), record.get(1), record.get(2), Double.parseDouble(record.get(3)), Double.parseDouble(record.get(4)), Double.parseDouble(record.get(5)), Double.parseDouble(record.get(6).replace("$","")), Integer.parseInt(record.get(7))));	
		}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		//**************************************************************//
	}
	
	public List<Movie> searchByTitle(String keyword)
	{
		//********************* YOUR CODE HERE **************************//
		List<Movie> keywordContainedMovies = new ArrayList<Movie>();
		for(Movie movie : movies) {
			if(movie.getTitle().contains(keyword)) {
				keywordContainedMovies.add(movie);
			}
		}
		
		return keywordContainedMovies;
		//**************************************************************//
	}
	
	public List<Movie> searchByRottenTomatoesScores(double lowScore , double highScore)
	{
		//********************* YOUR CODE HERE **************************//
		List<Movie> scoreInRangeMovies = new ArrayList<Movie>();
		for(Movie movie : movies) {
			if(movie.getRottenTomatoesScore()>=lowScore && movie.getRottenTomatoesScore()<=highScore) {
				scoreInRangeMovies.add(movie);
			}
		}
		
		return scoreInRangeMovies;
		//**************************************************************//
	}
	
	//Challenge : Search by genre
	public List<Movie> searchByGenre(String genre){
		List<Movie> selectedGenreMovies = new ArrayList<Movie>();
		for(Movie movie : movies) {
			if(movie.getGenre().contains(genre)) {
				selectedGenreMovies.add(movie);
			}
		}
		return selectedGenreMovies;
	}
	
	//Challenge : Search by genre and Score
	public List<Movie> searchByGenreAndScore(String genre, double lowScore, double highScore){
		List<Movie> selectedGenreScoreMovies = new ArrayList<Movie>();
		for(Movie movie : movies) {
			if(movie.getGenre().contains(genre) && movie.getAudienceScore() >= lowScore && movie.getAudienceScore() <= highScore) {
				selectedGenreScoreMovies.add(movie);
			}
		}
		return selectedGenreScoreMovies;
	}
	
	public static void saveMoviesJSON(List<Movie> movieList, String outFilename)
	{
		//********************* YOUR CODE HERE **************************//
		Gson gson = new Gson();
		
		//Challenge
		Gson gsonPrettier = new GsonBuilder().setPrettyPrinting().create();  ;
		
	
			try {
				FileWriter writer = new FileWriter(outFilename);
				writer.write(gsonPrettier.toJson(movieList));
				System.out.println(gson.toJson(movieList));
				writer.close();
				
			}catch(IOException e){
				e.printStackTrace();
			} catch (JsonIOException e) {
				e.printStackTrace();
			}
		//**************************************************************//
	}


}
