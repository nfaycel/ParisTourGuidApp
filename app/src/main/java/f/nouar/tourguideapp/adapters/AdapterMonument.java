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

public class AdapterMonument extends RecyclerView.Adapter<AdapterMonument.ViewHolder> {
    private Monument[] listData;
    public AdapterMonument(Monument[] listdata) {
        this.listData = listdata;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.item_monument, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Monument myListData = listData[position];
        holder.monument_title.setText(listData[position].getTitle());
        holder.monument_description.setText(listData[position].getDescription());
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
        public TextView monument_title;
        public TextView monument_description;
        public LinearLayout linearLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            this.imageView = itemView.findViewById(R.id.imageView);
            this.monument_title =  itemView.findViewById(R.id.monument_title);
            this.monument_description = itemView.findViewById(R.id.monument_description);
            linearLayout = itemView.findViewById(R.id.linearLayout);
        }
    }
}