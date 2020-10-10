package com.was.jetpackcase.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseDataBindingHolder;
import com.was.jetpackcase.R;
import com.was.jetpackcase.bean.UserBean;
import com.was.jetpackcase.databinding.ItemDatabindingAdapterBinding;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DataBindingQuickAdapter extends BaseQuickAdapter<UserBean, BaseDataBindingHolder<ItemDatabindingAdapterBinding>> {

    public DataBindingQuickAdapter() {
        super(R.layout.item_databinding_adapter);
    }


    @Override
    protected void convert(@NotNull BaseDataBindingHolder<ItemDatabindingAdapterBinding> holder, UserBean user) {
        ItemDatabindingAdapterBinding binding = holder.getDataBinding();
        if (binding != null) {
            binding.setUser(user);
            binding.executePendingBindings();
        }
    }
}
