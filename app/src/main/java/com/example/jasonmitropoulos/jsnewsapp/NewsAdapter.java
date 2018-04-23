package com.example.jasonmitropoulos.jsnewsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;


public class NewsAdapter extends ArrayAdapter<News> {

    /**
     * The part of the dateTime string from the Guardian service that we use to
     * extract the date.
     */
    private static final String DATETIME_SEPARATOR = "T";

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    /**
     * Returns a list item view that displays information about the news at the given position
     * in the list of news.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        // Find the news at the given position in the list of news
        News currentNews = getItem(position);

        // Find the TextView with view ID section
        TextView sectionView = (TextView) listItemView.findViewById(R.id.section);
        sectionView.setText(currentNews.getSection());

        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        titleView.setText(currentNews.getTitle());

        TextView authorView = (TextView) listItemView.findViewById(R.id.author);
        authorView.setText(currentNews.getAuthor());


        String dateTime = currentNews.getDate();

        String date;


        // Split the dateTime string into different parts (as an array of Strings)
        // based on the letter "T". Use the String in position 0 of the array
        String[] parts = dateTime.split(DATETIME_SEPARATOR);
        date = parts[0];


        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        dateView.setText(date);

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }


}

