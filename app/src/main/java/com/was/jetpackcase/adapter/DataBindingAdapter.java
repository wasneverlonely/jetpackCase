package com.was.jetpackcase.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.library.baseAdapters.BR;
import androidx.recyclerview.widget.RecyclerView;

import com.was.jetpackcase.R;
import com.was.jetpackcase.bean.UserBean;
import com.was.jetpackcase.databinding.ItemDatabindingAdapterBinding;
import com.was.jetpackcase.viewholder.DataBindingAdapterViewHolder;

import java.util.List;

public class DataBindingAdapter extends RecyclerView.Adapter<DataBindingAdapterViewHolder> implements View.OnClickListener {

    private List<UserBean> data;

    public DataBindingAdapter(List<UserBean> data) {
        this.data = data;
    }

    private OnItemOnClickListener onItemOnClickListener;

    public interface OnItemOnClickListener {
        void onItemClick(View view, int position);
    }

    public OnItemOnClickListener getOnItemOnClickListener() {
        return onItemOnClickListener;
    }

    public void setOnItemOnClickListener(OnItemOnClickListener onItemOnClickListener) {
        this.onItemOnClickListener = onItemOnClickListener;
    }


    @NonNull
    @Override
    public DataBindingAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ItemDatabindingAdapterBinding itemDatabinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_databinding_adapter, parent, false);
        itemDatabinding.getRoot().setOnClickListener(this);
        return new DataBindingAdapterViewHolder(itemDatabinding);

    }

    @Override
    public void onBindViewHolder(@NonNull DataBindingAdapterViewHolder holder, int position) {

        ItemDatabindingAdapterBinding itemDatabinding = holder.getItemDatabinding();
        UserBean user = data.get(position);
        itemDatabinding.setVariable(BR.user, user);
        // 将position 保存在itemView的Tag中,以便点击时获取
        itemDatabinding.getRoot().setTag(position);
        itemDatabinding.executePendingBindings();

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public void onClick(View view) {
        if (onItemOnClickListener != null)
            onItemOnClickListener.onItemClick(view, (int) view.getTag());
    }
}
