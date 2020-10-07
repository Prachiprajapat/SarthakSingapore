package com.creators.sarthaksingapore.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.creators.sarthaksingapore.Fragments.ContactedFragment;
import com.creators.sarthaksingapore.Fragments.LastViewedFragment;
import com.creators.sarthaksingapore.Fragments.SavedSearchFragment;
import com.creators.sarthaksingapore.Fragments.ScheduledToursFragment;
import com.creators.sarthaksingapore.Fragments.ShortlistedFragment;

public class PageAdapter extends FragmentPagerAdapter {
    private int numsoftabs;
//    private PagerNotifier pagerNotifier;
//    private boolean data = true;

    public PageAdapter(FragmentManager fm, int numsoftabs) {
        super(fm);
        this.numsoftabs = numsoftabs;
//        this.pagerNotifier = pagerNotifier;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0 :
                return new ContactedFragment();
            case 1:
                return new ShortlistedFragment();
            case 2:
                return new LastViewedFragment();
            case 3:
                return new SavedSearchFragment();
            case 4:
                return  new ScheduledToursFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numsoftabs;
    }

//    public void setDataNotifier(boolean data) {
//        this.data = data;
//    }
}