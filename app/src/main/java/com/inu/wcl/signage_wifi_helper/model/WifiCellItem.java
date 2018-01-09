package com.inu.wcl.signage_wifi_helper.model;

/**
 * Created by HYEONDO-PC on 2018-01-09.
 */

public class WifiCellItem {
    private String ssid;
    private boolean isProtected;
    private int rssi;

    public String getSsid() {
        return ssid;
    }
    public void setSsid(String ssid) {
        this.ssid = ssid;
    }
    public boolean getIsProtected() {
        return isProtected;
    }
    public void setIsProtected(boolean aProtected) {
        isProtected = aProtected;
    }
    public int getRssi() {
        return rssi;
    }
    public void setRssi(int rssi) {
        this.rssi = rssi;
    }
}
