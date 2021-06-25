package com.example.quotesapp.Adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.quotesapp.Fragments.ProfileScreenFragment;
import com.example.quotesapp.Fragments.QuotesScreenFragment;

public class FragmentsAdapter extends FragmentPagerAdapter {

    public FragmentsAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0: return new QuotesScreenFragment();
            case 1: return new ProfileScreenFragment();
            default: return new QuotesScreenFragment();
        }

    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        switch (position)
        {
            case 0: title="Quotes"; break;
            case 1: title="Profile"; break;

        }
        return title;
    }
}
