package com.example.a16022706.knowyourfacts;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag3 extends Fragment {

    Button btnChangeColor;
    TextView tv2;



    public Frag3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View vvv = inflater.inflate(R.layout.fragment_3, container, false);


        btnChangeColor = (Button) vvv.findViewById(R.id.btnChangeColor);
        tv2 = (TextView) vvv.findViewById(R.id.tvFact2);

        btnChangeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                int color = Color.argb(255, r.nextInt(256), r.nextInt(256), r.nextInt(256));
                vvv.setBackgroundColor(color);

            }
        });

        return vvv;
    }

}
