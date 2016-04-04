package edu.neu.massmutual.dharabhavsar.androidnewsreader.utils;

import edu.neu.massmutual.dharabhavsar.androidnewsreader.model.ApiResponse;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Dhara on 4/4/2016.
 */
public interface NYTimesAPI {
    @GET(Constants.NEWS_API_KEY)
    Call<ApiResponse> getNews();
}
