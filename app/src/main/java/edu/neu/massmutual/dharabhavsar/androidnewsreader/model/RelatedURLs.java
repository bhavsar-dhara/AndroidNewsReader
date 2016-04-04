package edu.neu.massmutual.dharabhavsar.androidnewsreader.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

/**
 * Created by Dhara on 4/3/2016.
 */
@Generated("org.jsonschema2pojo")
public class RelatedURLs {

    private List<RelatedUrl> relatedUrls = new ArrayList<RelatedUrl>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The relatedUrls
     */
    public List<RelatedUrl> getRelatedUrls() {
        return relatedUrls;
    }

    /**
     * @param relatedUrls The related_urls
     */
    public void setRelatedUrls(List<RelatedUrl> relatedUrls) {
        this.relatedUrls = relatedUrls;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
