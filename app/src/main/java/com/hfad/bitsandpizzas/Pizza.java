package com.hfad.bitsandpizzas;

/**
 * Created by davidg on 04/05/2017.
 */

public class Pizza {
    private String name;
    private int imageResourceId;

    public static final Pizza[] pizzas = {
            new Pizza("Карбонара", R.drawable.diavolo),
            new Pizza("Песто", R.drawable.funghi),
            new Pizza("Пепперони Фреш с томатами", R.drawable.p3),
            new Pizza("Пепперони Фреш с перцем", R.drawable.p4),
            new Pizza("Сырная", R.drawable.p5),
            new Pizza("Ветчина и сыр", R.drawable.p6),
            new Pizza("Кисло-сладкий цыпленок", R.drawable.p7),
            new Pizza("Ветчина и грибы", R.drawable.p8),
            new Pizza("Чизбургер-пицца", R.drawable.p9),
            new Pizza("Сырный цыпленок", R.drawable.p10),
            new Pizza("Аррива", R.drawable.p11),
            new Pizza("Мексиканская ", R.drawable.p12)
    };

    private Pizza(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
