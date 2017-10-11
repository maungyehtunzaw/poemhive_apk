package poemhive.dream.yehtun.poemhive.utils;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import poemhive.dream.yehtun.poemhive.MemberFragment;
import poemhive.dream.yehtun.poemhive.PoetFragment;

/**
 * Created by Ye Htun on 2017-10-04.
 */

public class PoetFragmentPagerAdaptor extends FragmentPagerAdapter {
    private static int NUM_ITEMS = 2;
    public PoetFragmentPagerAdaptor(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        switch (position){
            case 0:fragment=new PoetFragment();break;
            case 1:fragment=new MemberFragment();break;
            default:fragment=new PoetFragment();break;
        }
        return fragment;
    }



    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    @Override
    public CharSequence getPageTitle(int position) {
       if(position==0)
           return "CLASSIC POETS";
        else
           return  "MEMBERS POETS";
    }
}
