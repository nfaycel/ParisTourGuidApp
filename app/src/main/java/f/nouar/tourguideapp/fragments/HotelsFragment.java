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
        Hotel hotel1 = new Hotel(getResources().getString(R.string.hotel1_title),
                getResources().getString(R.string.hotel1_description), R.drawable.hotel1);
        Hotel hotel2 = new Hotel(getResources().getString(R.string.hotel2_title),
                getResources().getString(R.string.hotel2_description), R.drawable.hotel2);
        Hotel hotel3 = new Hotel(getResources().getString(R.string.hotel3_title),
                getResources().getString(R.string.hotel3_description), R.drawable.hotel3);
        Hotel hotel4 = new Hotel(getResources().getString(R.string.hotel4_title),
                getResources().getString(R.string.hotel4_description), R.drawable.hotel4);
        Hotel hotel5 = new Hotel(getResources().getString(R.string.hotel5_title),
                getResources().getString(R.string.hotel5_description), R.drawable.hotel5);
        Hotel hotel6 = new Hotel(getResources().getString(R.string.hotel6_title),
                getResources().getString(R.string.hotel6_description), R.drawable.hotel6);
        Hotel hotel7 = new Hotel(getResources().getString(R.string.hotel7_title),
                getResources().getString(R.string.hotel7_description), R.drawable.hotel7);
        Hotel hotel8 = new Hotel(getResources().getString(R.string.hotel8_title),
                getResources().getString(R.string.hotel8_description), R.drawable.hotel8);
        Hotel[] hotels = {hotel1, hotel2, hotel3, hotel4, hotel5, hotel6, hotel7, hotel8, hotel3};
        mAdapter = new AdapterHotel(hotels);
        recyclerView.setAdapter(mAdapter);
        return view;
    }
}
