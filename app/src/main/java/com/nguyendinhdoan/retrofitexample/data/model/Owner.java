package com.nguyendinhdoan.retrofitexample.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Owner {
    @Expose
    @SerializedName("link")
    private String link;
    @Expose
    @SerializedName("display_name")
    private String displayName;
    @Expose
    @SerializedName("profile_image")
    private String profileImage;
    @Expose
    @SerializedName("accept_rate")
    private int acceptRate;
    @Expose
    @SerializedName("user_type")
    private String userType;
    @Expose
    @SerializedName("user_id")
    private int userId;
    @Expose
    @SerializedName("reputation")
    private int reputation;

    public void setLink(String link) {
        this.link = link;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public void setAcceptRate(int acceptRate) {
        this.acceptRate = acceptRate;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public String getLink() {
        return link;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public int getAcceptRate() {
        return acceptRate;
    }

    public String getUserType() {
        return userType;
    }

    public int getUserId() {
        return userId;
    }

    public int getReputation() {
        return reputation;
    }
}
