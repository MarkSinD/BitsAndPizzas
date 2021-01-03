package com.hfad.bitsandpizzas;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class BurgerDetailActivity extends AppCompatActivity {
    public static final String EXTRA_BURGER_ID = "pizzaId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger_detail);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        int burgerId = (Integer) getIntent().getExtras().get(EXTRA_BURGER_ID);

        String burgerName = Burger.burgers[burgerId].getName();
        TextView textName = (TextView)findViewById(R.id.burger_detail_name_text);
        textName.setText(burgerName);

        int burgerImage = Burger.burgers[burgerId].getImageResourceId();
        ImageView imageView = (ImageView) findViewById(R.id.burger_detail_image);
        imageView.setImageDrawable(ContextCompat.getDrawable(this, burgerImage));
        imageView.setContentDescription(burgerName);

        String burgerDesc = Burger.burgers[burgerId].getDescription();
        TextView textDesc = (TextView) findViewById(R.id.burger_detail_desc_text);
        textDesc.setText(burgerDesc);


    }
}