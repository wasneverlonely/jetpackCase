package com.was.jetpackcase.viewholder;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.was.jetpackcase.databinding.ItemDatabindingAdapterBinding;

public class DataBindingAdapterViewHolder extends RecyclerView.ViewHolder {

    ItemDatabindingAdapterBinding itemDatabinding;

    public ItemDatabindingAdapterBinding getItemDatabinding() {
        return itemDatabinding;
    }

    public void setItemDatabinding(ItemDatabindingAdapterBinding itemDatabinding) {
        this.itemDatabinding = itemDatabinding;
    }

    public DataBindingAdapterViewHolder(@NonNull ItemDatabindingAdapterBinding itemView) {
        super(itemView.getRoot());
        this.itemDatabinding = itemView;
    }
}
