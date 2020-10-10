package com.was.jetpackcase.fragment;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.was.jetpackcase.R;
import com.was.jetpackcase.bean.UserBean;
import com.was.jetpackcase.databinding.FragmentViewModelTwoBinding;
import com.was.jetpackcase.model.UserViewModel;


public class ViewModelTwoFragment extends Fragment {

    public ViewModelTwoFragment() {
    }


    FragmentViewModelTwoBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_view_model_two, container, false);

        ViewModelProvider.Factory factory = new ViewModelProvider.AndroidViewModelFactory(getActivity().getApplication());
        UserViewModel viewModel = new ViewModelProvider(getActivity(), factory).get(UserViewModel.class);

        viewModel.getDatas().observe(getActivity(), new Observer<UserBean>() {
            @Override
            public void onChanged(UserBean userBean) {
                binding.tvContent.setText(userBean.getName());
            }
        });
        return binding.getRoot();

    }
}