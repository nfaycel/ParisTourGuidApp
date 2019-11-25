package f.nouar.tourguideapp.adapters;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.DrawableRes;
import androidx.recyclerview.widget.RecyclerView;
import f.nouar.tourguideapp.R;

public class AdapterPark extends RecyclerView.Adapter<AdapterPark.ViewHolder> {
    private Park[] listData;
    public AdapterPark(Park[] listdata) {
        this.listData = listdata;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.item_park, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Park myListData = listData[position];
        holder.park_title.setText(listData[position].getTitle());
        holder.park_description.setText(listData[position].getDescription());
        holder.imageView.setImageResource(listData[position].getImgId());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"click on item: "+myListData.getDescription(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listData.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView park_title;
        public TextView park_description;
        public LinearLayout linearLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            this.imageView = itemView.findViewById(R.id.imageView);
            this.park_title =  itemView.findViewById(R.id.park_title);
            this.park_description = itemView.findViewById(R.id.park_description);
            linearLayout = itemView.findViewById(R.id.linearLayout);
        }
    }
}