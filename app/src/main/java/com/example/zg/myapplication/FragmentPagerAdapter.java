package com.example.zg.myapplication;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

public class FragmentPagerAdapter extends android.support.v4.app.FragmentPagerAdapter {

    final int PAGE_COUNT = 2;
    private static String tabTitles[] = new String[]{"帖子", "阅读故事"};
    private Context context;

    public FragmentPagerAdapter(FragmentManager fragmentManager, Context context) {
        this(fragmentManager, context, tabTitles);
    }

    public FragmentPagerAdapter(FragmentManager fragmentManager, Context context, String[] tabTitles) {
        super(fragmentManager);
        this.context = context;
        if (tabTitles != null && tabTitles.length > 0) {
            this.tabTitles = tabTitles;
        }
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PostsFragment();
        } else {
            return new ReadingStoryFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

}
