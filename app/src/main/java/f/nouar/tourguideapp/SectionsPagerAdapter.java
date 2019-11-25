package f.nouar.tourguideapp;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import f.nouar.tourguideapp.fragments.*;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {


    //private static final int[] TAB_TITLES = new int[]{R.string.national_parks, R.string.historical_monuments,R.string.restaurants, R.string.hotels};
    private final Context mContext;
    private static final int[] TAB_TITLES = new int[]{R.string.national_parks, R.string.historical_monuments,R.string.restaurants,R.string.hotels};

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                return new ParksFragment();
            case 1:
                return new MonumentsFragment();
            case 2:
                return new RestaurantsFragment();
            case 3:
                return new HotelsFragment();
        }
        return new ParksFragment();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }


    @Override
    public int getCount() {
        return 4;
    }
}