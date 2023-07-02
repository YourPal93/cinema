package cinema;

public class Viewer {
    private String nickName;
    private int age;
    private int watchedMovies;


    public Viewer(String nickName, int age, int watchedMovies) {
        this.nickName = nickName == null || nickName.isBlank() ? "default_name" : nickName;
        this.age = Math.max(0, age);
        this.watchedMovies = Math.max(0, watchedMovies);
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

    public void setWatchedMovies(int watchedMovies) {
        this.watchedMovies = Math.max(0, watchedMovies);
    }
}
