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

public class AdapterRestaurant extends RecyclerView.Adapter<AdapterRestaurant.ViewHolder> {
    private Restaurant[] listData;
    public AdapterRestaurant(Restaurant[] listdata) {
        this.listData = listdata;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.item_restaurant, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Restaurant myListData = listData[position];
        holder.restaurant_title.setText(listData[position].getTitle());
        holder.restaurant_description.setText(listData[position].getDescription());
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
        public TextView restaurant_title;
        public TextView restaurant_description;
        public LinearLayout linearLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            this.imageView = itemView.findViewById(R.id.imageView);
            this.restaurant_title =  itemView.findViewById(R.id.restaurant_title);
            this.restaurant_description = itemView.findViewById(R.id.restaurant_description);
            linearLayout = itemView.findViewById(R.id.linearLayout);
        }
    }
}