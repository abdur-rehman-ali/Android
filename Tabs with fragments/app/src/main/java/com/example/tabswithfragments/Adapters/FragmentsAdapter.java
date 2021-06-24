package com.example.tabswithfragments.Adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.tabswithfragments.Fragments.MondayFragment;
import com.example.tabswithfragments.Fragments.TuesdayFragment;
import com.example.tabswithfragments.Fragments.WednesdayFragment;

public class FragmentsAdapter extends FragmentPagerAdapter {
    public FragmentsAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0: return new MondayFragment();
            case 1: return new TuesdayFragment();
            case 2: return new WednesdayFragment();
            default: return new MondayFragment();
        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String tabName=null;
        switch (position)
        {
            case 0: tabName="Monday"; break;
            case 1: tabName="Tuesday"; break;
            case 2: tabName="Wednesday"; break;
        }

        return tabName;
    }
}
