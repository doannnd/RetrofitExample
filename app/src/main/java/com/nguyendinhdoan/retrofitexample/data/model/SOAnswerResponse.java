package com.nguyendinhdoan.retrofitexample.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SOAnswerResponse {

    @Expose
    @SerializedName("quota_remaining")
    private int quotaRemaining;
    @Expose
    @SerializedName("quota_max")
    private int quotaMax;
    @Expose
    @SerializedName("backoff")
    private int backoff;
    @Expose
    @SerializedName("has_more")
    private boolean hasMore;
    @Expose
    @SerializedName("items")
    private List<Item> items;

    public void setQuotaRemaining(int quotaRemaining) {
        this.quotaRemaining = quotaRemaining;
    }

    public void setQuotaMax(int quotaMax) {
        this.quotaMax = quotaMax;
    }

    public void setBackoff(int backoff) {
        this.backoff = backoff;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public int getQuotaRemaining() {
        return quotaRemaining;
    }

    public int getQuotaMax() {
        return quotaMax;
    }

    public int getBackoff() {
        return backoff;
    }

    public boolean isHasMore() {
        return hasMore;
    }

    public List<Item> getItems() {
        return items;
    }
}
