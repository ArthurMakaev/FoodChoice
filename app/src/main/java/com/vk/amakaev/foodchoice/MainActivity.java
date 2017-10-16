package com.vk.amakaev.foodchoice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    Button btn;
    String[] arr={"Porridge",
            "Onion soup",
            "Boiled buckwheat",
            "Fish soup",
            "Kharcho",
            "Boiled pearl barley",
            "Sushi",
            "Millet porridge",
            "Curd fritter",
            "Cream of rice",
            "Sandwich",
            "Sauerkraut",
            "Tempura",
            "Fondue",
            "Meatball",
            "Chop",
            "Foie gras",
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=(TextView) findViewById(R.id.txt);
        btn = (Button) findViewById(R.id.btn);
        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
Random random=new Random(17);

                txt.setText(arr[random.nextInt()]);
            }


        };
        btn.setOnClickListener(oclBtnOk);
    }

}
