package f.nouar.tourguideapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import f.nouar.tourguideapp.R;
import f.nouar.tourguideapp.adapters.AdapterPark;
import f.nouar.tourguideapp.adapters.Park;

public class ParksFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_parks, container, false);
        recyclerView = view.findViewById(R.id.recycler_view_parks);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        Park park1 = new Park(getResources().getString(R.string.park1_title),getResources().getString(R.string.park1_description),R.drawable.park1_tuileries_garden);
        Park park2 = new Park(getResources().getString(R.string.park2_title),getResources().getString(R.string.park2_description),R.drawable.park2_luxembourg_gardens);
        Park park3 = new Park(getResources().getString(R.string.park3_title),getResources().getString(R.string.park3_description),R.drawable.park3_parc_monceau);
        Park park4 = new Park(getResources().getString(R.string.park4_title),getResources().getString(R.string.park4_description),R.drawable.park4_parc_montsouris);
        Park park5 = new Park(getResources().getString(R.string.park5_title),getResources().getString(R.string.park5_description),R.drawable.park5_champ_de_mars);
        Park park6 = new Park(getResources().getString(R.string.park6_title),getResources().getString(R.string.park6_description),R.drawable.park6_bois_de_boulogne);
        Park park7 = new Park(getResources().getString(R.string.park7_title),getResources().getString(R.string.park7_description),R.drawable.park7_parc_de_belleville);
        Park park8 = new Park(getResources().getString(R.string.park8_title),getResources().getString(R.string.park8_description),R.drawable.park8_jardin_des_plantes);
        Park park9 = new Park(getResources().getString(R.string.park9_title),getResources().getString(R.string.park9_description),R.drawable.park9_la_villette);
        Park[] parks = {park1,park2,park3,park4,park5,park6,park7,park8,park9};
        mAdapter = new AdapterPark(parks);
        recyclerView.setAdapter(mAdapter);
        return view;
    }
}
