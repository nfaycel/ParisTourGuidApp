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
        Monument monument1 = new Monument("Sainte-Chapelle",
                "Ornate, 13th-century, Gothic chapel with relics & notable stained-glass windows of biblical scenes.", R.drawable.monument1_sainte_chapelle);
        Monument monument2 = new Monument("Panthéon",
                "18th-century mausoleum with colonnaded facade, housing remains of notable French citizens.", R.drawable.monument2_panth_on);
        Monument monument3 = new Monument("Sacré-Cœur",
                "Iconic, domed white church, completed in 1914, with interior mosaics, stained-glass windows & crypt.", R.drawable.monument3_sacr__c_ur);
        Monument monument4 = new Monument("Conciergerie",
                "Iconic triumphal arch built to commemorate Napoleon's victories, with an observation deck.", R.drawable.monument4_conciergerie);
        Monument monument5 = new Monument("Arc de Triomphe",
                "Iconic triumphal arch built to commemorate Napoleon's victories, with an observation deck.", R.drawable.monument5_arc_de_triomphe);
        Monument monument6 = new Monument("Luxor Obelisk",
                "Ancient Egyptian granite obelisk, originally from Luxor, with hieroglyphs & a gold-leafed top.", R.drawable.monument6_luxor_obelisk);
        Monument monument7 = new Monument("Saint-Jacques Tower",
                "The only remaining part of a 16th-century church that was destroyed during the French Revolution.", R.drawable.monument7_saint_jacques_tower);
        Monument monument8 = new Monument("Grand Palais",
                "Art nouveau hall with domed glass roof, built in 1900, hosting exhibitions and cultural events.", R.drawable.monument8_grand_palais);
        Monument[] monuments = {monument1, monument2, monument3, monument4, monument5, monument6, monument7, monument8, monument3};
        mAdapter = new AdapterMonument(monuments);
        recyclerView.setAdapter(mAdapter);
        return view;
    }
}
