package com.suek.ex44fragment2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class MyFragment extends Fragment {
    //이 프레그먼트가 보여줄 뷰를 만들어서 리턴해주는 콜백메소드(자동실행)

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragement_my, container, false);

        //혹시 setArguments()로 전달된 값이 있다면..
        Bundle bundle= getArguments();

        String name= bundle.getString("Name");
        int age= bundle.getInt("Age", 0);

        Toast.makeText( getActivity(), name+", "+age, Toast.LENGTH_SHORT ).show();

        return view;
    }
}
