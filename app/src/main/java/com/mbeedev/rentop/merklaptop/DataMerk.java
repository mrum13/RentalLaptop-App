package com.mbeedev.rentop.merklaptop;

import com.mbeedev.rentop.R;

import java.util.ArrayList;

public class DataMerk {

    private static int[] merkAcer = {
            R.drawable.aceraspire3,
            R.drawable.acere14,
            R.drawable.acerz476
    };

    private static String[] namaLaptopAcer = {
            "Acer Aspire 3",
            "Acer E-14",
            "Acer Z476",
    };

    private static String[] spekLaptopAcer = {
            "Windows 10 HomeAMDA9-94203 \n" +
                    "GHzDual-core (2 Core™)AMD15.6\"6 GB1 TB",
            "Windows 10 HomeAMDA9-94203 \n" +
                    "GHzDual-core (2 Core™)AMD15.6\"6 GB1 TB",
            "Windows 10 HomeAMDA9-94203 \n" +
                    "GHzDual-core (2 Core™)AMD15.6\"6 GB1 TB",
    };

    private static int[] merkLenovo = {
            R.drawable.thinkpadx230,
            R.drawable.lenovox260,
            R.drawable.lenovoideapad130
    };

    private static String[] namaLaptopLenovo = {
            "Lenovo Thinkpad X230",
            "Lenovo Thinkpad X260",
            "Lenovo Ideapad 130",
    };

    private static String[] spekLaptopLenovo = {
            "Windows 10 HomeAMDA9-94203 \n" +
                    "GHzDual-core (2 Core™)AMD15.6\"6 GB1 TB",
            "Windows 10 HomeAMDA9-94203 \n" +
                    "GHzDual-core (2 Core™)AMD15.6\"6 GB1 TB",
            "Windows 10 HomeAMDA9-94203 \n" +
                    "GHzDual-core (2 Core™)AMD15.6\"6 GB1 TB",
    };

    private static int[] merkAsus = {
            R.drawable.asus_tuf_fx505,
            R.drawable.asus_zenbook_15,
            R.drawable.asus_rog_strix
    };

    private static String[] namaLaptopAsus = {
            "Asus TUF FX505",
            "Asus Zenbook 15",
            "Asus ROG Strix",
    };

    private static String[] spekLaptopAsus = {
            "Windows 10 HomeAMDA9-94203 \n" +
                    "GHzDual-core (2 Core™)AMD15.6\"6 GB1 TB",
            "Windows 10 HomeAMDA9-94203 \n" +
                    "GHzDual-core (2 Core™)AMD15.6\"6 GB1 TB",
            "Windows 10 HomeAMDA9-94203 \n" +
                    "GHzDual-core (2 Core™)AMD15.6\"6 GB1 TB",
    };

    private static int[] merkApple = {
            R.drawable.macbook_air_2020,
            R.drawable.macbook_pro_2017,
            R.drawable.macbook_pro_2012_md101
    };

    private static String[] namaLaptopApple = {
            "Macbook Air 2020",
            "Macbook Pro 2017",
            "Macbook Pro 2012",
    };

    private static String[] spekLaptopMacbook = {
            "Windows 10 HomeAMDA9-94203 \n" +
                    "GHzDual-core (2 Core™)AMD15.6\"6 GB1 TB",
            "Windows 10 HomeAMDA9-94203 \n" +
                    "GHzDual-core (2 Core™)AMD15.6\"6 GB1 TB",
            "Windows 10 HomeAMDA9-94203 \n" +
                    "GHzDual-core (2 Core™)AMD15.6\"6 GB1 TB",
    };

    public static ArrayList<ModelMerk> getListDataAcer() {
        ArrayList<ModelMerk> list = new ArrayList<>();
        for (int position = 0; position < merkAcer.length; position++) {
            ModelMerk model = new ModelMerk();
            model.setGambarMerk(merkAcer[position]);
            model.setNamaLaptop(namaLaptopAcer[position]);
            model.setDetailIsi(spekLaptopAcer[position]);
            list.add(model);
        }
        return list;
    }

    public static ArrayList<ModelMerk> getListDataLenovo() {
        ArrayList<ModelMerk> list = new ArrayList<>();
        for (int position = 0; position < merkLenovo.length; position++) {
            ModelMerk model = new ModelMerk();
            model.setGambarMerk(merkLenovo[position]);
            model.setNamaLaptop(namaLaptopLenovo[position]);
            model.setDetailIsi(spekLaptopLenovo[position]);
            list.add(model);
        }
        return list;
    }

    public static ArrayList<ModelMerk> getListDataAsus() {
        ArrayList<ModelMerk> list = new ArrayList<>();
        for (int position = 0; position < merkAsus.length; position++) {
            ModelMerk model = new ModelMerk();
            model.setGambarMerk(merkAsus[position]);
            model.setNamaLaptop(namaLaptopAsus[position]);
            model.setDetailIsi(spekLaptopAsus[position]);
            list.add(model);
        }
        return list;
    }

    public static ArrayList<ModelMerk> getListDataMacbook() {
        ArrayList<ModelMerk> list = new ArrayList<>();
        for (int position = 0; position < merkApple.length; position++) {
            ModelMerk model = new ModelMerk();
            model.setGambarMerk(merkApple[position]);
            model.setNamaLaptop(namaLaptopApple[position]);
            model.setDetailIsi(spekLaptopMacbook[position]);
            list.add(model);
        }
        return list;
    }
}
