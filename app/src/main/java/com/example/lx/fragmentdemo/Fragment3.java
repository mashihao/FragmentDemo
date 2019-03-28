package com.example.lx.fragmentdemo;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment3 extends Fragment {


    private TextView mTextView;
    private View mView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_3, container, false);
        mTextView = (TextView) mView.findViewById(R.id.text3);
        mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(getActivity(), Main2Activity.class), 101);
            }
        });
        return mView;
    }
//此方法在Fragment中

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (hidden) {
            //Fragment隐藏时调用
            Toast.makeText(getActivity(), "隐藏fragment 3", Toast.LENGTH_SHORT).show();
        } else {
            //Fragment显示时调用
            mTextView.setText("显示fragment 3");
        }

    }
}
