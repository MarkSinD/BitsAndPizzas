package com.hfad.bitsandpizzas;

public class Burger {

    private String name;
    private int imageResourceId;
    private String description;

    public static final Burger[] burgers = {
            new Burger("Jack D", R.drawable.b1, "с говяжьей котлетой, соусом мустарда, овощами, сырами чеддер и моцарелла"),
            new Burger("Спецагент", R.drawable.b2, "С беконом, 4 говяжьими котлетами, сыром чеддер и моцарелла"),
            new Burger("Bad Bro", R.drawable.b3, "Заказ на данный бургер осуществляется за 24 часа в рабочее время. Трехкилограммовый классический бургер для Ваших мероприятий. Большая булочка, 2 огромных котлеты из мраморной говядины, сыры Чеддер и Моцарелла, овощи."),
            new Burger("Барон Дюпон", R.drawable.b4, "с двойной говяжьей котлетой, сыром и овощами"),
            new Burger("Царь Бургер", R.drawable.b5, "классика с говяжьей котлетой и овощами"),
            new Burger("Нобель", R.drawable.b6, "с говяжьей котлетой, картофельным драником и грибным дюкселем"),
            new Burger("Люк Бессон", R.drawable.b7, "С куриным филе, сырной котлетой и соусом маринара"),
            new Burger("Ференц Лист", R.drawable.b8, "С куриным филе, сырной котлетой и соусом маринара"),
            new Burger("Эдди", R.drawable.b9, "с говяжьей котлетой, сыром, беконом и пряной вишней"),
            new Burger("Гриль Бургер", R.drawable.b10, "С говяжьей котлетой, сырным фондю и чесночным фри"),
            new Burger("Гриль Лайт", R.drawable.b11, "с говяжьей котлетой, сыром и обжаренным беконом"),
            new Burger("Гриль HOT", R.drawable.b12, "с говяжьей котлетой, соусом мустарда, овощами, сырами чеддер и моцарелла"),
    };

    Burger(String name, int imageResourceId, String description){
        this.name = name;
        this.imageResourceId = imageResourceId;
        this.description = description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getName(){
        return name;
    }

    public String getDescription() {
        return description;
    }
}
