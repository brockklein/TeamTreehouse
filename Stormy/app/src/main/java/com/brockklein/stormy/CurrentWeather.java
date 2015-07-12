package com.brockklein.stormy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by BrockKlein on 7/5/15.
 */
public class CurrentWeather {
    private String mIcon;
    private Long mTime;
    private double mTemperature;
    private double mHumidityl;
    private double mPrecipChance;
    private String mSummary;
    private String mTimeZone;

    public String getTimeZone() {return mTimeZone;}
    public void setTimeZone(String timeZone) {mTimeZone = timeZone;}

    public String getIcon() {return mIcon;}
    public void setIcon(String icon) {mIcon = icon;}

    public int getIconId() {
        //clear-day, clear-night, rain, snow, sleet, wind, fog, cloudy, partly-cloudy-day, or partly-cloudy-night

        int iconId = R.mipmap.clear_day;

        if (mIcon.equals("clear-day")){
            iconId = R.mipmap.clear_day;
        }
        else if (mIcon.equals("clear-night")){
            iconId = R.mipmap.clear_night;
        }
        else if (mIcon.equals("rain")) {
            iconId = R.mipmap.rain;
        }
        else if (mIcon.equals("snow")) {
            iconId = R.mipmap.snow;
        }
        else if (mIcon.equals("sleet")) {
            iconId = R.mipmap.sleet;
        }
        else if (mIcon.equals("wind")) {
            iconId = R.mipmap.wind;
        }
        else if (mIcon.equals("fog")) {
            iconId = R.mipmap.fog;
        }
        else if (mIcon.equals("cloudy")) {
            iconId = R.mipmap.cloudy;
        }
        else if (mIcon.equals("partly-cloudy-day")) {
            iconId = R.mipmap.partly_cloudy;
        }
        else if (mIcon.equals("partly-cloudy-night")) {
            iconId = R.mipmap.cloudy_night;
        }

        return iconId;
    }

    public Long getTime() {return mTime;}
    public void setTime(Long time) {mTime = time;}

    public String getFormattedTime(){
        SimpleDateFormat formattedTime = new SimpleDateFormat("h:mm a");
        formattedTime.setTimeZone(TimeZone.getTimeZone(mTimeZone));
        Date dateTime = new Date(mTime*1000);
        String timeString = formattedTime.format(dateTime);
        return timeString;
    }

    public double getTemperature() {return mTemperature;}
    public void setTemperature(double temperature) {mTemperature = temperature;}

    public double getHumidityl() {return mHumidityl;}
    public void setHumidityl(double humidityl) {mHumidityl = humidityl;}

    public double getPrecipChance() {return mPrecipChance;}
    public void setPrecipChance(double precipChance) {mPrecipChance = precipChance;}

    public String getSummary() {return mSummary;}
    public void setSummary(String summary) {mSummary = summary;}

}
