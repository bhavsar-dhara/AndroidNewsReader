package edu.neu.massmutual.dharabhavsar.androidnewsreader.ui;

import android.content.Context;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import edu.neu.massmutual.dharabhavsar.androidnewsreader.R;
import edu.neu.massmutual.dharabhavsar.androidnewsreader.model.Result;

/**
 * Created by Dhara on 4/4/2016.
 */
public class NewsArrayAdapter extends ArrayAdapter<Result> {
    private static final String LOG_TAG = "NewsArrayAdapter";
    private Context context;
    private ArrayList<Result> newsData = null;

    //    using arrayAdapters so could use Picasso library
//    which requires context for fetching the pictures
    public NewsArrayAdapter(Context context, ArrayList<Result> objects) {
        super(context, R.layout.news_list_adapter, objects);
        this.context = context;
        this.newsData = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

//        Log.e(LOG_TAG, "Position = " + position);
        Result news = getItem(position);
        ViewHolder holder;

        if (convertView == null) {
            holder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.news_list_adapter, parent, false);
            holder.mTextViewTitle = (TextView) convertView.findViewById(R.id.news_title);
            holder.mImageView = (ImageView) convertView.findViewById(R.id.news_thumbnail);
            holder.mTextViewDate = (TextView) convertView.findViewById(R.id.news_date);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.mTextViewTitle.setText(news.getTitle());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
//        Log.e(LOG_TAG, "news.getCreatedDate() = " + news.getCreatedDate());
        Date dateObj = new Date();
        try {
            dateObj = sdf.parse(news.getCreatedDate());
        } catch (ParseException e) {
            e.printStackTrace();
            Log.e(LOG_TAG, "in ParseException CATCH");
        }
        String dateFormat = "MM/dd/yy hh:mm a"; // 09/21/2011 02:17 pm
        holder.mTextViewDate.setText(DateFormat.format(dateFormat, dateObj));

        String imageLink = news.getThumbnailStandard();
        try {
//            Log.e(LOG_TAG, "in TRY Picasso");
            Picasso.with(this.context)
                    .load(imageLink)
                    .placeholder(R.mipmap.ic_launcher)
                    .error(R.mipmap.ic_launcher)
                    .into(holder.mImageView);
        } catch (Exception e) {
//            Log.e(LOG_TAG, "in CATCH");
            holder.mImageView.setImageResource(R.mipmap.ic_launcher);
        }

        return convertView;
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder {
        public ImageView mImageView;
        public TextView mTextViewTitle;
        public TextView mTextViewDate;

//        public ViewHolder(View v) {
//            super(v);
//            mImageView = (ImageView) v.findViewById(R.id.news_thumbnail);
//            mTextViewTitle = (TextView) v.findViewById(R.id.news_title);
//        }
    }
}
