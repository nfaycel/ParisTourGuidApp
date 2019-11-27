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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_restaurants, container, false);
        recyclerView = view.findViewById(R.id.recycler_view_restaurant);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        Restaurant restaurant1 = new Restaurant("Signature",
                "Asian Fusion  12 Rue des Trois Frères Opens at 7:00 PM", R.drawable.restaurant1_signature);
        Restaurant restaurant2 = new Restaurant("Patchanka",
                "Barbecue  33-35 Rue Saint-Sébastien Opens at 12:00 PM.", R.drawable.restaurant2_patchanka);
        Restaurant restaurant3 = new Restaurant("Madito",
                "Lebanese 38 Rue de Cîteaux Opens at 11:45 AM", R.drawable.restaurant3_madito);
        Restaurant restaurant4 = new Restaurant("Le Cinq",
                "French · 31 Avenue George V Opens at 12:30 PM", R.drawable.restaurant4_le_cinq);
        Restaurant restaurant5 = new Restaurant("L'Arcane",
                "French · 52 Rue Lamarck Opens at 12:00 PM", R.drawable.restaurant5_arcane);
        Restaurant restaurant6 = new Restaurant("Epicure",
                "Haute French · 112 Rue du Faubourg Saint-Honoré Opens at 7:30 AM", R.drawable.restaurant6_epicure);
        Restaurant restaurant7 = new Restaurant("La Grange Aux Canards",
                "Restaurant · 23 Rue Frédéric Sauton Opens at 6:30 PM", R.drawable.restaurant7_la_grange_aux_canards);
        Restaurant restaurant8 = new Restaurant("Sacred Flower",
                "French · 50 Rue de Clignancourt Opens at 11:30 AM", R.drawable.restaurant8_sacred_flower);
        Restaurant[] restaurants = {restaurant1, restaurant2, restaurant3, restaurant4, restaurant5, restaurant6, restaurant7, restaurant8, restaurant3};
        mAdapter = new AdapterRestaurant(restaurants);
        recyclerView.setAdapter(mAdapter);
        return view;
    }
}