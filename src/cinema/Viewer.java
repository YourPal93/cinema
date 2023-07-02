package cinema;

import java.util.ArrayList;
import java.util.List;

public class Viewer {
    private String nickName;
    private int age;
    private int watchedMovies;

    private List<Cinema> watchedMoviesList;


    public Viewer(String nickName, int age) {
        this.nickName = nickName == null || nickName.isBlank() ? "default_name" : nickName;
        this.age = Math.max(0, age);
        this.watchedMoviesList = new ArrayList<>();
    }


    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null || nickName.isBlank() ? "default_name" : nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = Math.max(0, age);
    }

    public int getWatchedMovies() {
        return watchedMovies;
    }

    public void setWatchedMoviesList(List<Cinema> watchedMoviesList) {
        this.watchedMoviesList = watchedMoviesList == null ? new ArrayList<>() : watchedMoviesList;
        this.watchedMovies = watchedMoviesList.size();
    }

    public void addWatchedMovie(Cinema movie) {
        if(movie != null) {
            this.watchedMoviesList.add(movie);
            this.watchedMovies++;
        }
    }
}
