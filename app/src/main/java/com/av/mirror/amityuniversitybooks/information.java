package com.av.mirror.amityuniversitybooks;

/**
 * Created by hp on 4/3/2017.
 */
public class information {

    int iconid;
    String title;

    public information() {
    }

    public information( int iconid, String title) {
        this.iconid = iconid;
        this.title = title;
    }

    public int getIconid() {
        return iconid;
    }

    public void setIconid(int iconid) {
        this.iconid = iconid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
