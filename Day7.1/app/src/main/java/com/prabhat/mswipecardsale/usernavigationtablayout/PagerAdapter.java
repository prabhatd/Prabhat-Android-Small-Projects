package com.prabhat.mswipecardsale.usernavigationtablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {
    int mNumOfTabs;
    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs=NumOfTabs;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0: return new TabFragment1();
            case  1: return new TabFragment2();
            case  2: return new TabFragment3();
            default:return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
