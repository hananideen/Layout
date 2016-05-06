package com.android.layout.fragment;

/**
 * Created by Hanani on 1/14/2016.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).

        switch (position){
            case 0:
                return FragmentOne.newInstance(position + 1);
            case 1:
                return FragmentTwo.newInstance(position);
            case 2:
                return FragmentThree.newInstance(position);
            case 3:
                return FragmentFour.newInstance(position);
            case 4:
                return FragmentFive.newInstance(position);
        }
        return null;
    }

    @Override
    public int getCount() {
        // Show total pages.
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "SECT 1";
            case 1:
                return "SECT 2";
            case 2:
                return "SECT 3";
            case 3:
                return "SECT 4";
            case 4:
                return "SECT 5";
        }
        return null;
    }
}