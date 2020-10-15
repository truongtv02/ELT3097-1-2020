package com.dumv.ailatrieuphu.object;

import java.util.ArrayList;

public class CauHoi {
    private String noiDung,dapAnDung;
    private ArrayList<String> arrDapAnSai;

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getDapAnDung() {
        return dapAnDung;
    }

    public void setDapAnDung(String dapAnDung) {
        this.dapAnDung = dapAnDung;
    }

    public ArrayList<String> getArrDapAnSai() {
        return arrDapAnSai;
    }

    public void setArrDapAnSai(ArrayList<String> arrDapAnSai) {
        this.arrDapAnSai = arrDapAnSai;
    }
    public void setArrDapAnSai(String dapAnSai) {//dapan1&dapan2&dâpn3
        String arrS[]=dapAnSai.split("&");
        this.arrDapAnSai = new ArrayList<>();
        for (String s : arrS){
            arrDapAnSai.add(s);
        }
    }
}
