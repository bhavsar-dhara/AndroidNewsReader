package edu.neu.massmutual.dharabhavsar.androidnewsreader.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

/**
 * Created by Dhara on 4/3/2016.
 */
@Generated("org.jsonschema2pojo")
public class Result {

    @SerializedName("section")
    @Expose
    private String section;
    @SerializedName("subsection")
    @Expose
    private String subsection;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("abstract")
    @Expose
    private String _abstract;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("byline")
    @Expose
    private String byline;
    @SerializedName("thumbnail_standard")
    @Expose
    private String thumbnailStandard;
    @SerializedName("item_type")
    @Expose
    private String itemType;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("updated_date")
    @Expose
    private String updatedDate;
    @SerializedName("created_date")
    @Expose
    private String createdDate;
    @SerializedName("published_date")
    @Expose
    private String publishedDate;
    @SerializedName("material_type_facet")
    @Expose
    private String materialTypeFacet;
    @SerializedName("kicker")
    @Expose
    private String kicker;
    @SerializedName("subheadline")
    @Expose
    private String subheadline;
    //    @SerializedName("des_facet")
//    @Expose
//    private String[] desFacet;
//    @SerializedName("org_facet")
//    @Expose
//    private String[] orgFacet;
//    @SerializedName("per_facet")
//    @Expose
//    private String[] perFacet;
//    @SerializedName("geo_facet")
//    @Expose
//    private String geoFacet;
//    Commented them because otherwise they were throwing the following error
//    E/MainActivity: java.lang.IllegalStateException:
// Expected BEGIN_OBJECT but was BEGIN_ARRAY at line 1 column 1252 path $.results[0].multimedia
//    E/MainActivity: com.google.gson.JsonSyntaxException: java.lang.IllegalStateException:
// Expected BEGIN_OBJECT but was BEGIN_ARRAY at line 1 column 1252 path $.results[0].multimedia
//    @SerializedName("related_urls")
//    @Expose
//    private RelatedURLs relatedUrls;
//    @SerializedName("multimedia")
//    @Expose
//    private Multimedia[] multimedia;
    @SerializedName("blog_name")
    @Expose
    private String blogName;

    /**
     *
     * @return
     * The section
     */
    public String getSection() {
        return section;
    }

    /**
     *
     * @param section
     * The section
     */
    public void setSection(String section) {
        this.section = section;
    }

    /**
     *
     * @return
     * The subsection
     */
    public String getSubsection() {
        return subsection;
    }

    /**
     *
     * @param subsection
     * The subsection
     */
    public void setSubsection(String subsection) {
        this.subsection = subsection;
    }

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The _abstract
     */
    public String getAbstract() {
        return _abstract;
    }

    /**
     *
     * @param _abstract
     * The abstract
     */
    public void setAbstract(String _abstract) {
        this._abstract = _abstract;
    }

    /**
     *
     * @return
     * The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     * The byline
     */
    public String getByline() {
        return byline;
    }

    /**
     *
     * @param byline
     * The byline
     */
    public void setByline(String byline) {
        this.byline = byline;
    }

    /**
     *
     * @return
     * The thumbnailStandard
     */
    public String getThumbnailStandard() {
        return thumbnailStandard;
    }

    /**
     *
     * @param thumbnailStandard
     * The thumbnail_standard
     */
    public void setThumbnailStandard(String thumbnailStandard) {
        this.thumbnailStandard = thumbnailStandard;
    }

    /**
     *
     * @return
     * The itemType
     */
    public String getItemType() {
        return itemType;
    }

    /**
     *
     * @param itemType
     * The item_type
     */
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    /**
     *
     * @return
     * The source
     */
    public String getSource() {
        return source;
    }

    /**
     *
     * @param source
     * The source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     *
     * @return
     * The updatedDate
     */
    public String getUpdatedDate() {
        return updatedDate;
    }

    /**
     *
     * @param updatedDate
     * The updated_date
     */
    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
     *
     * @return
     * The createdDate
     */
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     *
     * @param createdDate
     * The created_date
     */
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    /**
     *
     * @return
     * The publishedDate
     */
    public String getPublishedDate() {
        return publishedDate;
    }

    /**
     *
     * @param publishedDate
     * The published_date
     */
    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    /**
     *
     * @return
     * The materialTypeFacet
     */
    public String getMaterialTypeFacet() {
        return materialTypeFacet;
    }

    /**
     *
     * @param materialTypeFacet
     * The material_type_facet
     */
    public void setMaterialTypeFacet(String materialTypeFacet) {
        this.materialTypeFacet = materialTypeFacet;
    }

    /**
     *
     * @return
     * The kicker
     */
    public String getKicker() {
        return kicker;
    }

    /**
     *
     * @param kicker
     * The kicker
     */
    public void setKicker(String kicker) {
        this.kicker = kicker;
    }

    /**
     *
     * @return
     * The subheadline
     */
    public String getSubheadline() {
        return subheadline;
    }

    /**
     *
     * @param subheadline
     * The subheadline
     */
    public void setSubheadline(String subheadline) {
        this.subheadline = subheadline;
    }

    /**
     *
     * @return
     * The desFacet
     */
//    public String[] getDesFacet() {
//        return desFacet;
//    }

    /**
     *
     * @param desFacet
     * The des_facet
     */
//    public void setDesFacet(String[] desFacet) {
//        this.desFacet = desFacet;
//    }

    /**
     *
     * @return
     * The orgFacet
     */
//    public String[] getOrgFacet() {
//        return orgFacet;
//    }

    /**
     *
     * @param orgFacet
     * The org_facet
     */
//    public void setOrgFacet(String[] orgFacet) {
//        this.orgFacet = orgFacet;
//    }

    /**
     *
     * @return
     * The perFacet
     */
//    public String[] getPerFacet() {
//        return perFacet;
//    }

    /**
     *
     * @param perFacet
     * The per_facet
     */
//    public void setPerFacet(String[] perFacet) {
//        this.perFacet = perFacet;
//    }

    /**
     *
     * @return
     * The geoFacet
     */
//    public String getGeoFacet() {
//        return geoFacet;
//    }

    /**
     *
     * @param geoFacet
     * The geo_facet
     */
//    public void setGeoFacet(String geoFacet) {
//        this.geoFacet = geoFacet;
//    }

    /**
     *
     * @return
     * The relatedUrls
     */
//    public RelatedURLs getRelatedUrls() {
//        return relatedUrls;
//    }

    /**
     *
     * @param relatedUrls
     * The related_urls
     */
//    public void setRelatedUrls(RelatedURLs relatedUrls) {
//        this.relatedUrls = relatedUrls;
//    }

    /**
     *
     * @return
     * The multimedia
     */
//    public Multimedia[] getMultimedia() {
//        return multimedia;
//    }

    /**
     *
     * @param multimedia
     * The multimedia
     */
//    public void setMultimedia(Multimedia[] multimedia) {
//        this.multimedia = multimedia;
//    }

    /**
     *
     * @return
     * The blogName
     */
    public String getBlogName() {
        return blogName;
    }

    /**
     *
     * @param blogName
     * The blog_name
     */
    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

}