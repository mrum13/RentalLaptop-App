package com.mbeedev.rentop.merklaptop;

public class ModelMerk {
    int gambarMerk;
    String namaLaptop,detailIsi;

    public String getDetailIsi() {
        return detailIsi;
    }

    public void setDetailIsi(String detailIsi) {
        this.detailIsi = detailIsi;
    }

    public String getNamaLaptop() {
        return namaLaptop;
    }

    public void setNamaLaptop(String namaLaptop) {
        this.namaLaptop = namaLaptop;
    }

    public int getGambarMerk() {
        return gambarMerk;
    }

    public void setGambarMerk(int gambarMerk) {
        this.gambarMerk = gambarMerk;
    }



    public ModelMerk() {
        this.gambarMerk = gambarMerk;
        this.namaLaptop = namaLaptop;
        this.detailIsi = detailIsi;
    }
}
