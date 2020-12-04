package com.emrannik.androidnik.emrannik.hotelbooking_ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private RecyclerView recyclerview_popular;
    private AdapterPopular mAdapter;
    private List<String> datas;
    private List<String> datas_loc;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerview_popular = v.findViewById(R.id.recyclerview_popular);
        recyclerview_popular.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false);
        recyclerview_popular.setLayoutManager(layoutManager);

        datas = new ArrayList<>();
        datas.add("Room Name1");
        datas.add("Room Name2");
        datas.add("Room Name3");
        datas.add("Room Name4");
        datas.add("Room Name5");

        datas_loc=new ArrayList<>();
        datas_loc.add("Australia");
        datas_loc.add("India");
        datas_loc.add("Canada");
        datas_loc.add("Dubai");
        datas_loc.add("Japan");

        int[] myImageList=new int[]{R.drawable.pic1, R.drawable.pic2,R.drawable.pic3,R.drawable.pic4,R.drawable.pic5};

        mAdapter = new AdapterPopular(datas,datas_loc,myImageList,getActivity());
        recyclerview_popular.setAdapter(mAdapter);

        return v;
    }
}
