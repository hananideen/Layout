package com.android.layout.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.layout.R;

/**
 * Created by Hanani on 14-Jan-16.
 */
public class FragmentThree extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    public static FragmentThree newInstance(int sectionNumber) {
        FragmentThree fragment = new FragmentThree();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public FragmentThree() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_three, container, false);
        return rootView;
    }
}
