package com.nguyendinhdoan.retrofitexample.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {
    @Expose
    @SerializedName("question_id")
    private int questionId;
    @Expose
    @SerializedName("answer_id")
    private int answerId;
    @Expose
    @SerializedName("creation_date")
    private int creationDate;
    @Expose
    @SerializedName("last_edit_date")
    private int lastEditDate;
    @Expose
    @SerializedName("last_activity_date")
    private int lastActivityDate;
    @Expose
    @SerializedName("score")
    private int score;
    @Expose
    @SerializedName("is_accepted")
    private boolean isAccepted;
    @Expose
    @SerializedName("owner")
    private Owner owner;

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public void setCreationDate(int creationDate) {
        this.creationDate = creationDate;
    }

    public void setLastEditDate(int lastEditDate) {
        this.lastEditDate = lastEditDate;
    }

    public void setLastActivityDate(int lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setIsAccepted(boolean isAccepted) {
        this.isAccepted = isAccepted;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int getQuestionId() {
        return questionId;
    }

    public int getAnswerId() {
        return answerId;
    }

    public int getCreationDate() {
        return creationDate;
    }

    public int getLastEditDate() {
        return lastEditDate;
    }

    public int getLastActivityDate() {
        return lastActivityDate;
    }

    public int getScore() {
        return score;
    }

    public boolean isAccepted() {
        return isAccepted;
    }

    public Owner getOwner() {
        return owner;
    }
}
