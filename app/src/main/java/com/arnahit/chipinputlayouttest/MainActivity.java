package com.arnahit.chipinputlayouttest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


import com.arnahit.chipinputlayout.ChipsInputLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ChipsInputLayout chipsInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        chipsInput = (ChipsInputLayout) findViewById(R.id.chips_input);

        List<CoolChip> chips = new ArrayList<>();

        chips.add(new CoolChip(1001,"alireza"));
        chips.add(new CoolChip(1002,"reza"));
        chips.add(new CoolChip(1003,"ali"));
        chips.add(new CoolChip(1004,"ahmad"));
        chips.add(new CoolChip(1005,"mahmood"));
        this.chipsInput.setFilterableChipList(chips);
    }
}
