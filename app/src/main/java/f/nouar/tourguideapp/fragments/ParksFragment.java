package f.nouar.tourguideapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import f.nouar.tourguideapp.R;
import f.nouar.tourguideapp.adapters.*;


public class ParksFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_parks, container, false);
        recyclerView = view.findViewById(R.id.recycler_view_parks);
        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);
        // use a linear layout manager
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
        Park park1 = new Park("Tuileries Garden","Expansive, 17th-century formal garden dotted with statues, including 18 bronzes by Maillol.",R.drawable.park1_tuileries_garden);
        Park park2 = new Park("park2","park2 description",R.drawable.park1_tuileries_garden);
        Park park3 = new Park("park3","park3 description",R.drawable.park1_tuileries_garden);
        Park park4 = new Park("park4","park4 description",R.drawable.park1_tuileries_garden);
        Park park5 = new Park("park5","park5 description",R.drawable.park1_tuileries_garden);
        Park park6 = new Park("park6","park6 description",R.drawable.park1_tuileries_garden);
        Park park7 = new Park("park7","park7 description",R.drawable.park1_tuileries_garden);
        Park park8 = new Park("park8","park8 description",R.drawable.park1_tuileries_garden);
        Park park9 = new Park("park9","park9 description",R.drawable.park1_tuileries_garden);
        Park[] parks = {park1,park2,park3,park4,park5,park6,park7,park8,park9};
        mAdapter = new AdapterPark(parks);
        recyclerView.setAdapter(mAdapter);
        return view;
    }
}
