package classwork.lesson18_2;

import java.util.List;

public class ArticleList {
    private List<Article> articles;

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "ArticleList{" +
                "articles=" + articles +
                '}';
    }
}
