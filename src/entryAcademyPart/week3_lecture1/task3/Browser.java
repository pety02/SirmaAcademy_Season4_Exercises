package entryAcademyPart.week3_lecture1.task3;

import java.util.ArrayDeque;

public class Browser {
    private ArrayDeque<String> urls;
    private String currentURL;

    private String nextPage() {
        return this.currentURL;
    }

    private String backPage() {
        if(this.urls.isEmpty()) {
            return "no previous URLs";
        }
        setCurrentURL(this.urls.pop());
        return this.currentURL;
    }

    public Browser() {
        this.setUrls(new ArrayDeque<>());
        this.setCurrentURL(null);
    }

    public ArrayDeque<String> getUrls() {
        return urls;
    }

    public void setUrls(ArrayDeque<String> urls) {
        this.urls = urls;
    }

    public String getCurrentURL() {
        return currentURL;
    }

    public void setCurrentURL(String currentURL) {
        this.currentURL = currentURL;
    }

    public void executeCommand(String cmd) {
        switch (cmd) {
            case "Home" -> System.out.println();
            case "next" -> System.out.println(this.nextPage());
            case "back" -> System.out.println(this.backPage());
            default -> {
                if(this.currentURL != null) {
                    this.urls.push(this.currentURL);
                }
                this.currentURL = cmd;
                System.out.println(this.currentURL);
            }
        }
    }

    @Override
    public String toString() {
        return currentURL;
    }
}