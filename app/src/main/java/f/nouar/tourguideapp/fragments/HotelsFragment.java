package f.nouar.tourguideapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import f.nouar.tourguideapp.R;
import f.nouar.tourguideapp.adapters.AdapterHotel;
import f.nouar.tourguideapp.adapters.Hotel;

public class HotelsFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hotels, container, false);
        recyclerView = view.findViewById(R.id.recycler_view_hotels);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        Hotel hotel1 = new Hotel("Hôtel Ritz Paris",
                "Renowned luxury hotel with posh quarters & upscale dining, plus a chic spa & a gym.", R.drawable.hotel1);
        Hotel hotel2 = new Hotel("The Peninsula Paris",
                "High-end hotel offering grand dining & a rooftop bar with city views, plus a spa & an indoor pool.", R.drawable.hotel2);
        Hotel hotel3 = new Hotel("Four Seasons Hotel George V, Paris",
                "Ornate, high-end hotel offering elegant rooms & suites, plus renown dining, a chic bar & luxe spa.", R.drawable.hotel3);
        Hotel hotel4 = new Hotel("L’ Hotel - 5 Star Boutique Hotel",
                "Plush accommodations in a polished hotel offering a stylish restaurant, a bar & a hammam.", R.drawable.hotel4);
        Hotel hotel5 = new Hotel("Le Bristol Paris",
                "Regal 1925 hotel offering plush rooms & suites, plus acclaimed restaurants, a spa & an indoor pool.", R.drawable.hotel5);
        Hotel hotel6 = new Hotel("Hôtel de Crillon",
                "Elegant lodging featuring 3 restaurants & an opulent bar, plus an indoor pool & a spa.", R.drawable.hotel6);
        Hotel hotel7 = new Hotel("Le Meurice",
                "Lavish luxury hotel set in an 1835 palace offering fine-dining restaurants & a spa with a terrace.", R.drawable.hotel7);
        Hotel hotel8 = new Hotel("Hôtel Lutetia",
                "Stylish rooms & suites in a sophisticated hotel with an upscale brasserie, plus a pool & a spa.", R.drawable.hotel8);
        Hotel[] hotels = {hotel1, hotel2, hotel3, hotel4, hotel5, hotel6, hotel7, hotel8, hotel3};
        mAdapter = new AdapterHotel(hotels);
        recyclerView.setAdapter(mAdapter);
        return view;
    }
}
