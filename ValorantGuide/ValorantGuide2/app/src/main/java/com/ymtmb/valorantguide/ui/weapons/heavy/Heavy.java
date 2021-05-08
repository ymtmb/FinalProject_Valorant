package com.ymtmb.valorantguide.ui.weapons.heavy;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.ymtmb.valorantguide.MainActivity;
import com.ymtmb.valorantguide.R;

import com.ymtmb.valorantguide.OnBackPressed;


public class Heavy extends Fragment implements OnBackPressed {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        final View root = inflater.inflate(R.layout.fragment_heavy, container, false);

        MainActivity.previousTitle = "Weapons";
        final CardView ares = root.findViewById(R.id.cv_ares);
        final CardView odin = root.findViewById(R.id.cv_odin);


        ares.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Ares.class);
                root.getContext().startActivity(intent);
            }
        });
        odin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Odin.class);
                root.getContext().startActivity(intent);
            }
        });

        return root;
    }

    @Override
    public void onBackPressed() {
        getActivity().getSupportFragmentManager().popBackStack();
    }
}

