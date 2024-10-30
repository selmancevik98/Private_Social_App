package com.hebun.private_social_app.models;

public class Model_Shares {
    String share_id, user_id, share_image, share_text, share_date, share_time, share_like_count, share_comment_count;

    public Model_Shares() {
    }

    public Model_Shares(String share_id, String user_id, String share_image, String share_text, String share_date, String share_time, String share_like_count, String share_comment_count) {
        this.share_id = share_id;
        this.user_id = user_id;
        this.share_image = share_image;
        this.share_text = share_text;
        this.share_date = share_date;
        this.share_time = share_time;
        this.share_like_count = share_like_count;
        this.share_comment_count = share_comment_count;
    }

    public String getShare_id() {
        return share_id;
    }

    public void setShare_id(String share_id) {
        this.share_id = share_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getShare_image() {
        return share_image;
    }

    public void setShare_image(String share_image) {
        this.share_image = share_image;
    }

    public String getShare_text() {
        return share_text;
    }

    public void setShare_text(String share_text) {
        this.share_text = share_text;
    }

    public String getShare_date() {
        return share_date;
    }

    public void setShare_date(String share_date) {
        this.share_date = share_date;
    }

    public String getShare_time() {
        return share_time;
    }

    public void setShare_time(String share_time) {
        this.share_time = share_time;
    }

    public String getShare_like_count() {
        return share_like_count;
    }

    public void setShare_like_count(String share_like_count) {
        this.share_like_count = share_like_count;
    }

    public String getShare_comment_count() {
        return share_comment_count;
    }

    public void setShare_comment_count(String share_comment_count) {
        this.share_comment_count = share_comment_count;
    }
}
