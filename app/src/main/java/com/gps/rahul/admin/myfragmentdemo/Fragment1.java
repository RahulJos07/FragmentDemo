package com.gps.rahul.admin.myfragmentdemo;


        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.support.v4.app.FragmentManager;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;
        import java.util.ArrayList;
        import java.util.Arrays;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {
    private ArrayList<String> namelist=new ArrayList<String>();

    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_fragment1, container, false);
        final EditText editText=(EditText)view.findViewById(R.id.edt_text);
        Button button=(Button)view.findViewById(R.id.btn_add);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=editText.getText().toString();
                namelist.add(name);
                Toast.makeText(getContext(), ""+name, Toast.LENGTH_SHORT).show();
                //MainActivity.namelist.add(name);
                Fragment2 fragment2=new Fragment2();
                Bundle bundle=new Bundle();
                bundle.putStringArrayList("nm",namelist);
                fragment2.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.fragment2,fragment2).commit();
            }
        });
        return view;
    }
}
