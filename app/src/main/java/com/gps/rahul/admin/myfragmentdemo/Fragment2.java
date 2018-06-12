package com.gps.rahul.admin.myfragmentdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2 extends Fragment {
    private ArrayAdapter<String> arrayAdapter;
    private ArrayList<String> namelist=new ArrayList<String>();
    String name;
    ListView listView;
    public Fragment2() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_fragment2, container, false);
        Bundle bundle=getArguments();

        if(bundle!=null) {
            namelist = bundle.getStringArrayList("nm");
            listView = (ListView) view.findViewById(R.id.lst_view);
            arrayAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, namelist);
            listView.setAdapter(arrayAdapter);
        }
        return view;
    }
}
