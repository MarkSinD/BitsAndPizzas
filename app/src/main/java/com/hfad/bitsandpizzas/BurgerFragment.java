package com.hfad.bitsandpizzas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class BurgerFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        RecyclerView burgerRecycler =
                (RecyclerView) inflater.inflate(R.layout.fragment_burger,container,false);
        String[] burgerName = new String[Burger.burgers.length];

        for(int i = 0; i < Burger.burgers.length; i++){
            burgerName[i] = Burger.burgers[i].getName();
        }

        int[] burgerIdImage = new int[Burger.burgers.length];

        for(int i = 0; i < burgerIdImage.length; i++ ){
            burgerIdImage[i] = Burger.burgers[i].getImageResourceId();
        }

        String[] burgerDescription = new String[Burger.burgers.length];
        for(int i = 0; i < Burger.burgers.length; i++){
            burgerDescription[i] = Burger.burgers[i].getDescription();
        }

        CaptionedLinearAdapter adapter = new CaptionedLinearAdapter(burgerName, burgerIdImage, burgerDescription);
        burgerRecycler.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        burgerRecycler.setLayoutManager(linearLayoutManager);

        adapter.setListner(new CaptionedLinearAdapter.Listner() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(), BurgerDetailActivity.class);
                intent.putExtra(BurgerDetailActivity.EXTRA_BURGER_ID, position);
                getActivity().startActivity(intent);
            }
        });


        return burgerRecycler;
    }
}