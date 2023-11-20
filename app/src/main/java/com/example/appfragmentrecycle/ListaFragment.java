package com.example.appfragmentrecycle;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.appfragmentrecycle.databinding.FragmentListaBinding;

import java.util.ArrayList;


public class ListaFragment extends Fragment {

    //--
        private FragmentListaBinding binding;
        private AndroidAdapter androidAdapter = new AndroidAdapter();

    //--
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentListaBinding.inflate(inflater,container,false);
        binding.rvandroid.setLayoutManager(
                new LinearLayoutManager(requireActivity())
        );
        binding.rvandroid.setAdapter(androidAdapter);
        androidAdapter.setData(getData());
        return binding.getRoot();
    }

    private ArrayList<Android> getData(){
        ArrayList<Android> list = new ArrayList<>();
        list.add(new Android(list.size() +1,
                R.drawable.image1,
                "Angel cake",
                "Android 1.0"));

        list.add(new Android(list.size() +1,
                R.drawable.image2,
                "Angel cake",
                "Android 1.0"));

        list.add(new Android(list.size() +1,
                R.drawable.image3,
                "Angel cake",
                "Android 1.0"));

        list.add(new Android(list.size() +1,
                R.drawable.image4,
                "Angel cake",
                "Android 1.0"));

        list.add(new Android(list.size() +1,
                R.drawable.image5,
                "Angel cake",
                "Android 1.0"));

        list.add(new Android(list.size() +1,
                R.drawable.image6,
                "Angel cake",
                "Android 1.0"));

        list.add(new Android(list.size() +1,
                R.drawable.image7,
                "Angel cake",
                "Android 1.0"));

        list.add(new Android(list.size() +1,
                R.drawable.image8,
                "Angel cake",
                "Android 1.0"));

        return list;
    }
}