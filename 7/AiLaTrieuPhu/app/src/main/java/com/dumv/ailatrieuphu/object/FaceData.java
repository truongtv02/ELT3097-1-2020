package com.dumv.ailatrieuphu.object;

import java.util.ArrayList;
import java.util.Random;

public class FaceData {
    public FaceData() {
        taoCauHoi1();
    }

    public CauHoi taoCauHoi(int capDo) {
        Random r = new Random();
        ArrayList<CauHoi> arr = arrCauHoi.get(capDo - 1);
        return arr.get(r.nextInt(arr.size()));
    }

    ArrayList<ArrayList<CauHoi>> arrCauHoi = new ArrayList<>();

    public void taoCauHoi1() {
        ArrayList<CauHoi> arrCauSo1 = new ArrayList<>();
        arrCauSo1.add(taoCauHoi("Mưa ngâu là vào khoảng tháng mấy trong năm?", "7", "1&4&6"));
        // arrCauSo1.add(taoCauHoi("","",""));
        arrCauHoi.add(arrCauSo1);

        ///cau so 2

        ArrayList<CauHoi> arrCauSo2 = new ArrayList<>();
        arrCauSo2.add(taoCauHoi("Pha màu đỏ với màu xanh lam, ta được màu nào sau đây?", "Tím", "Vàng&Xanh&Nâu"));
        arrCauHoi.add(arrCauSo2);
        ///cau so 2

        ArrayList<CauHoi> a3 = new ArrayList<>();
        a3.add(taoCauHoi("Đâu là một loại hình chợ tạm tự phát thường xuất hiện trong các khu dân cư?",
                "Cóc",
                "Ếch" + "&" +
                "Thằn lằn" + "&"+
                "Nhái"));
        arrCauHoi.add(a3);
        ArrayList<CauHoi> a4 = new ArrayList<>();
        a4.add(taoCauHoi("Đâu là tên một loại chợ?",
                "Cóc",
                "Ếch" + "&" +
                        "Thằn lằn" + "&"+
                        "Nhái"));
        arrCauHoi.add(a4);
        ArrayList<CauHoi> a5 = new ArrayList<>();
        a5.add(taoCauHoi("Đâu là tên một bãi biển ở Quảng Bình?",
                "Đá Nhảy",
                "Đá Bò" + "&" +
                "Đá Chạy" + "&"+
                " Đá Lăn"));
        arrCauHoi.add(a5);
        ArrayList<CauHoi> a6 = new ArrayList<>();
        a6.add(taoCauHoi("Haiku là thể thơ truyền thống của nước nào?",
                "Nhật Bản",
                "Mông Cổ" + "&" +
                "Hàn Quốc" + "&"+
                "Trung Quốc"));
        arrCauHoi.add(a6);

    }

    private CauHoi taoCauHoi(String s1, String s2, String s3) {
        CauHoi c1 = new CauHoi();
        c1.setNoiDung(s1);
        c1.setDapAnDung(s2);
        c1.setArrDapAnSai(s3);
        return c1;
    }
}
