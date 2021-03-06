package com.example.brandon.kittenfactory;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.brandon.kittenfactory.Models.Cat;

import java.util.ArrayList;

/**
 * Created by Brandon on 4/2/2016.
 */
public class ResultFragment extends Fragment {

    private Button learnMore;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_result, container, false);

        learnMore = (Button)v.findViewById(R.id.btnLearnMore);
        learnMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewLearnMore();
            }
        });
        return v;
    }

    private void viewLearnMore(){
        Fragment fragment = new LearnFragment();
        FragmentManager fm = getActivity().getSupportFragmentManager();
        fm.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }

}
