package com.ymtmb.valorantguide.ui.weapons.sniper;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.material.tabs.TabLayout;
import com.ymtmb.valorantguide.MainActivity;
import com.ymtmb.valorantguide.R;

import com.ymtmb.valorantguide.ui.weapons.main.PlaceholderFragment;
import com.ymtmb.valorantguide.ui.weapons.main.SectionsPagerAdapter;

import static com.ymtmb.valorantguide.MainActivity.ads_on;


public class Operator extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_global);
        PlaceholderFragment.setX(36);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        MainActivity.previousTitle = "Home";

        // Bottom Ads
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        AdView mAdViewBot = findViewById(R.id.adViewBot);
        AdRequest adRequest = new AdRequest.Builder().build();
        if (ads_on) {
            mAdViewBot.loadAd(adRequest);
        }
        // Back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}
