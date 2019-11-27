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
        Park park1 = new Park("Tuileries Garden", "Expansive, 17th-century formal garden dotted with statues, including 18 bronzes by Maillol.",R.drawable.park1_tuileries_garden);
        Park park2 = new Park("Luxembourg Gardens","17th-century park with formally laid-out gardens, trees planted in patterns & statues on pedestals.",R.drawable.park2_luxembourg_gardens);
        Park park3 = new Park("Parc Monceau","Public park with trees, tarmac trails & statues plus 18th-century colonnade & pyramid follies.",R.drawable.park3_parc_monceau);
        Park park4 = new Park("Parc Montsouris","Park created under Napoléon III & inspired by parks in London, popular with local students.",R.drawable.park4_parc_montsouris);
        Park park5 = new Park("Champ de Mars","Landscaped park with paths & trees, bird life, extensive lawns & a children's play area.",R.drawable.park5_champ_de_mars);
        Park park6 = new Park("Bois de Boulogne","Former royal hunting grounds, now a huge public park with lakes, nature trails & botanical gardens.",R.drawable.park6_bois_de_boulogne);
        Park park7 = new Park("Parc de Belleville","Park created in 1988, with a playground, open-air theater, vineyard & museum about the city's air.",R.drawable.park7_parc_de_belleville);
        Park park8 = new Park("Jardin des Plantes","Vast park with plant species grown in botanical & alpine gardens & restored 19th-century hothouses.",R.drawable.park8_jardin_des_plantes);
        Park park9 = new Park("La Villette","Series of army museums including a church & the tombs of many famed officers, including Napoleon.",R.drawable.park9_la_villette);
        Park[] parks = {park1,park2,park3,park4,park5,park6,park7,park8,park9};
        mAdapter = new AdapterPark(parks);
        recyclerView.setAdapter(mAdapter);
        return view;
    }
}
