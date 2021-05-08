package com.ymtmb.valorantguide.ui.weapons.sniper;

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


public class Sniper extends Fragment implements OnBackPressed {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        final View root = inflater.inflate(R.layout.fragment_sniper, container, false);

        MainActivity.previousTitle = "Weapons";
        final CardView marshal = root.findViewById(R.id.cv_marshal);
        final CardView operator = root.findViewById(R.id.cv_operator);


        marshal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Marshal.class);
                root.getContext().startActivity(intent);
            }
        });
        operator.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Operator.class);
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

