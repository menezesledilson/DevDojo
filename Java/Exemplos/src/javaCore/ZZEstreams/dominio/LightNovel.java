package javaCore.ZZEstreams.dominio;

import java.util.Objects;

public class LightNovel {
    private String title;
    private double price;
    private Category category;

    public LightNovel(String title, double price, Category category) {
        this.title = title;
        this.price = price;
        this.category = category;
    }

    public LightNovel(String title, double price) {
        this.title = title;
        this.price = price;

    }

    public String getTitle() {
        return title;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "LightNovel{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LightNovel that = (LightNovel) o;
        return Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public Category getCategory() {
        return category;
    }
}
