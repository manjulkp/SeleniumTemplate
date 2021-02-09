package core;

public enum Url {
    CAMELOT_APPLICATION("https://t04.interactivetest.co.uk");
 
    private String url;
 
    Url(String url) {
        this.url = url;
    }
 
    public String getUrl() {
        return url;
    }
}
