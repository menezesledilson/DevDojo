package javaCore.ZZCLambda.Dominio;

public class Anime {
    private  String title;
     private int epsiodes;

    public Anime(String title, int epsiodes) {
        this.title = title;
        this.epsiodes = epsiodes;
    }

    public String getTitle() {
        return title;
    }

    public int getEpsiodes() {
        return epsiodes;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", episodes=" + epsiodes +
                '}';
    }
}
