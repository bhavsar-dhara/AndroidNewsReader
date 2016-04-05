package edu.neu.massmutual.dharabhavsar.androidnewsreader.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

/**
 * Created by Dhara on 4/3/2016.
 */
@Generated("org.jsonschema2pojo")
public class RelatedURLs {

    @SerializedName("related_urls")
    @Expose
    private List<RelatedUrl> relatedUrls = new ArrayList<RelatedUrl>();

    /**
     *
     * @return
     * The relatedUrls
     */
    public List<RelatedUrl> getRelatedUrls() {
        return relatedUrls;
    }

    /**
     *
     * @param relatedUrls
     * The related_urls
     */
    public void setRelatedUrls(List<RelatedUrl> relatedUrls) {
        this.relatedUrls = relatedUrls;
    }

}
