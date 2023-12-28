package com.amir.spygame;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CardsAdapter extends RecyclerView.Adapter<CardsAdapter.CardsViewHolder> {

    ArrayList<String> cardsList;

    public CardsAdapter() {


        cardsList = new ArrayList<>();

        cardsList.add("Player 1");
        cardsList.add("Player 2");
        cardsList.add("Player 3");
        cardsList.add("Player 4");
        cardsList.add("Player 5");
        cardsList.add("Player 6");
        cardsList.add("Player 7");
        cardsList.add("Player 8");
    }

    @NonNull
    @Override
    public CardsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        return new CardsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardsViewHolder holder, int position) {
        holder.tvCardItem.setText("Player " + cardsList.get(position));
    }

    @Override
    public int getItemCount() {
        return cardsList.size();
    }

    public static class CardsViewHolder extends RecyclerView.ViewHolder {

        ImageView imgCardItem;
        TextView tvCardItem;

        public CardsViewHolder(@NonNull View itemView) {
            super(itemView);

            imgCardItem = itemView.findViewById(R.id.imgCardItem);
            tvCardItem = itemView.findViewById(R.id.tvCardItem);
        }
    }
}
