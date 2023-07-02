package cinema;

public class Cinema {
    private String name;
    private String genre;
    private int lengthInHours;

    public Cinema(String name, String genre, int lengthInHours) {
        this.name = name == null || name.isBlank() ? "default_name" : name;
        this.genre = genre == null || genre.isBlank() ? "default_genre" : genre;
        this.lengthInHours = Math.max(0, lengthInHours);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null || name.isBlank() ? "default_name" : name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre == null || genre.isBlank() ? "default_genre" : genre;
    }

    public int getLengthInHours() {
        return lengthInHours;
    }

    public void setLengthInHours(int lengthInHours) {
        this.lengthInHours = Math.max(0, lengthInHours);
    }
}
