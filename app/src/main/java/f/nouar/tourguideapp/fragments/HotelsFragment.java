package f.nouar.tourguideapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import f.nouar.tourguideapp.R;

public class HotelsFragment extends Fragment {
  @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
      return inflater.inflate(R.layout.fragment_hotel, container, false);
  }
}
