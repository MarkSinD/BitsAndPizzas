package com.hfad.bitsandpizzas;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class CaptionedLinearAdapter extends RecyclerView.Adapter<CaptionedLinearAdapter.ViewHolder>  {

    private String[] captions;
    private int[] imageIds;
    private String[] description;
    private Listner listner;

    interface Listner{
        void onClick(int position);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;

        public ViewHolder(CardView cardView) {
            super(cardView);
            this.cardView = cardView;
        }
    }

    public CaptionedLinearAdapter(String[] captions, int[] imageIds, String[] description){
        this.captions = captions;
        this.imageIds = imageIds;
        this.description = description;
    }

    @Override
    public int getItemCount() {
        return captions.length;
    }

    public void setListner( Listner listner){
        this.listner = listner;
    }

    @Override
    public CaptionedLinearAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_captioned_burger, parent,false);
        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(CaptionedLinearAdapter.ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        CardView cardView = holder.cardView;
        ImageView imageView = (ImageView)cardView.findViewById(R.id.info_image_burger);
        Drawable drawable = ContextCompat.getDrawable(cardView.getContext(), imageIds[position]);
        imageView.setImageDrawable(drawable);
        imageView.setContentDescription(captions[position]);
        TextView textViewName = (TextView) cardView.findViewById(R.id.info_text_name_burger);
        textViewName.setText(captions[position]);
        TextView textViewDesc = (TextView) cardView.findViewById(R.id.info_text_desc_burger);
        textViewDesc.setText(description[position]);
        cardView.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(listner != null){
                    listner.onClick(position);
                }
            }
        });
    }




}
