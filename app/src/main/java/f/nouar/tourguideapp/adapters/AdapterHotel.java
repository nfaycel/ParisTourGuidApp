package f.nouar.tourguideapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import f.nouar.tourguideapp.R;

public class AdapterHotel extends RecyclerView.Adapter<AdapterHotel.ViewHolder> {
    private Hotel[] listData;
    public AdapterHotel(Hotel[] listdata) {
        this.listData = listdata;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.item_hotel, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Hotel myListData = listData[position];
        holder.hotel_title.setText(listData[position].getTitle());
        holder.hotel_description.setText(listData[position].getDescription());
        holder.imageView.setImageResource(listData[position].getImgId());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),myListData.getDescription(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listData.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView hotel_title;
        public TextView hotel_description;
        public LinearLayout linearLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            this.imageView = itemView.findViewById(R.id.imageView);
            this.hotel_title =  itemView.findViewById(R.id.hotel_title);
            this.hotel_description = itemView.findViewById(R.id.hotel_description);
            linearLayout = itemView.findViewById(R.id.linearLayout);
        }
    }
}