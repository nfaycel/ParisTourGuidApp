package f.nouar.tourguideapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import f.nouar.tourguideapp.R;
import f.nouar.tourguideapp.adapters.AdapterRestaurant;
import f.nouar.tourguideapp.adapters.Restaurant;

public class RestaurantsFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_restaurants, container, false);
        recyclerView = view.findViewById(R.id.recycler_view_restaurant);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        Restaurant restaurant1 = new Restaurant(getResources().getString(R.string.restaurant1_title),
                getResources().getString(R.string.restaurant1_description), R.drawable.restaurant1_signature);
        Restaurant restaurant2 = new Restaurant(getResources().getString(R.string.restaurant2_title),
                getResources().getString(R.string.restaurant2_description), R.drawable.restaurant2_patchanka);
        Restaurant restaurant3 = new Restaurant(getResources().getString(R.string.restaurant3_title),
                getResources().getString(R.string.restaurant3_description), R.drawable.restaurant3_madito);
        Restaurant restaurant4 = new Restaurant(getResources().getString(R.string.restaurant4_title),
                getResources().getString(R.string.restaurant4_description), R.drawable.restaurant4_le_cinq);
        Restaurant restaurant5 = new Restaurant(getResources().getString(R.string.restaurant5_title),
                getResources().getString(R.string.restaurant5_description), R.drawable.restaurant5_arcane);
        Restaurant restaurant6 = new Restaurant(getResources().getString(R.string.restaurant6_title),
                getResources().getString(R.string.restaurant6_description), R.drawable.restaurant6_epicure);
        Restaurant restaurant7 = new Restaurant(getResources().getString(R.string.restaurant7_title),
                getResources().getString(R.string.restaurant7_description), R.drawable.restaurant7_la_grange_aux_canards);
        Restaurant restaurant8 = new Restaurant(getResources().getString(R.string.restaurant8_title),
                getResources().getString(R.string.restaurant8_description), R.drawable.restaurant8_sacred_flower);
        Restaurant[] restaurants = {restaurant1, restaurant2, restaurant3, restaurant4, restaurant5, restaurant6, restaurant7, restaurant8, restaurant3};
        mAdapter = new AdapterRestaurant(restaurants);
        recyclerView.setAdapter(mAdapter);
        return view;
    }
}