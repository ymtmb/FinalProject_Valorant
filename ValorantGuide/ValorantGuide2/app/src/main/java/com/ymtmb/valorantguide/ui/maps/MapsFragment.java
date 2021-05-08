package com.ymtmb.valorantguide.ui.maps;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.ymtmb.valorantguide.MainActivity;
import com.ymtmb.valorantguide.R;

public class MapsFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_maps, container, false);

        MainActivity.previousTitle = "Home";

        return root;
    }
}
