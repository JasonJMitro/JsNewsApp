package com.example.jasonmitropoulos.jsnewsapp;

public class News {
    /**
     * news section
     */
    private String mSection;

    /**
     * news title
     */
    private String mTitle;

    /**
     * news author
     */
    private String mAuthor;

    /**
     * news date
     */
    private String mDate;

    /**
     * news URL
     */
    private String mUrl;

    public News(String section, String title, String author, String date, String url) {
        mSection = section;
        mTitle = title;
        mAuthor = author;
        mDate = date;
        mUrl = url;
    }

    /**
     * Returns the news section.
     */
    public String getSection() {
        return mSection;
    }

    /**
     * Returns the news title.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the news author.
     */
    public String getAuthor() {
        return mAuthor;
    }

    /**
     * Returns the news date.
     */
    public String getDate() {
        return mDate;
    }

    /**
     * Returns the news URL.
     */
    public String getUrl() {
        return mUrl;
    }
}
