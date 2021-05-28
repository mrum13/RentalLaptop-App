package com.mbeedev.rentop.merklaptop;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.mbeedev.rentop.DetailMerkActivity;
import com.mbeedev.rentop.R;

import java.util.ArrayList;

public class AdapterMerk extends RecyclerView.Adapter<AdapterMerk.ViewHolder> {
    Context context;
    ArrayList<ModelMerk> listMerk;

    public AdapterMerk(Context context, ArrayList<ModelMerk> listMerk) {
        this.context = context;
        this.listMerk = listMerk;
    }

    @NonNull
    @Override
    public AdapterMerk.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_merk,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterMerk.ViewHolder holder, int position) {
        final ModelMerk list = listMerk.get(position);

        Glide.with(context).load(list.getGambarMerk()).into(holder.img);
        holder.tvNamaLaptop.setText(list.getNamaLaptop());

        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kedetail = new Intent(context, DetailMerkActivity.class);

                kedetail.putExtra("nama_laptop", list.getNamaLaptop());
                kedetail.putExtra("gambar_laptop", list.getGambarMerk());
                kedetail.putExtra("detail_laptop", list.getDetailIsi());

                context.startActivity(kedetail);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMerk.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView img;
        private CardView cv;
        private TextView tvNamaLaptop;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            this.img=itemView.findViewById(R.id.gambar_merk);
            this.cv=itemView.findViewById(R.id.card_merk);
            this.tvNamaLaptop = itemView.findViewById(R.id.tv_card);
        }
    }
}
