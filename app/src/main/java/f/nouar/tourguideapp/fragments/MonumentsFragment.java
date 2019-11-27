package f.nouar.tourguideapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import f.nouar.tourguideapp.R;
import f.nouar.tourguideapp.adapters.AdapterMonument;
import f.nouar.tourguideapp.adapters.Monument;

public class MonumentsFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_monuments, container, false);
        recyclerView = view.findViewById(R.id.recycler_view_monuments);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        Monument monument1 = new Monument(getResources().getString(R.string.monument1_title),
                getResources().getString(R.string.monument1_description), R.drawable.monument1_sainte_chapelle);
        Monument monument2 = new Monument(getResources().getString(R.string.monument2_title),
                getResources().getString(R.string.monument2_description), R.drawable.monument2_panth_on);
        Monument monument3 = new Monument(getResources().getString(R.string.monument3_title),
                getResources().getString(R.string.monument3_description), R.drawable.monument3_sacr__c_ur);
        Monument monument4 = new Monument(getResources().getString(R.string.monument4_title),
                getResources().getString(R.string.monument4_description), R.drawable.monument4_conciergerie);
        Monument monument5 = new Monument(getResources().getString(R.string.monument5_title),
                getResources().getString(R.string.monument5_description), R.drawable.monument5_arc_de_triomphe);
        Monument monument6 = new Monument(getResources().getString(R.string.monument6_title),
                getResources().getString(R.string.monument6_description), R.drawable.monument6_luxor_obelisk);
        Monument monument7 = new Monument(getResources().getString(R.string.monument7_title),
                getResources().getString(R.string.monument7_description), R.drawable.monument7_saint_jacques_tower);
        Monument monument8 = new Monument(getResources().getString(R.string.monument8_title),
                getResources().getString(R.string.monument8_description), R.drawable.monument8_grand_palais);
        Monument[] monuments = {monument1, monument2, monument3, monument4, monument5, monument6, monument7, monument8, monument3};
        mAdapter = new AdapterMonument(monuments);
        recyclerView.setAdapter(mAdapter);
        return view;
    }
}
