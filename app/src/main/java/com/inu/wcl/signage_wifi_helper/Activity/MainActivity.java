package com.inu.wcl.signage_wifi_helper.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;

import com.inu.wcl.signage_wifi_helper.R;
import com.inu.wcl.signage_wifi_helper.etc.Debug;
import com.inu.wcl.signage_wifi_helper.model.WifiCellItem;
import com.inu.wcl.signage_wifi_helper.view.WifiCellAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private Context mContext;
    private RecyclerView.Adapter mAdater;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<WifiCellItem> mItems;

    @BindView(R.id.wList_rv)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mContext = this;
        init();
    }

    private void init(){
        mItems = new ArrayList<>();
        recyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);

        updateWifiList();
    }

    private void updateWifiList(){
        if(mItems == null)return;
        makeTestData();
        Debug.LOGD("wlist size : " + mItems.size());
        if (mItems.size() == 0) {

        } else {
            mAdater = new WifiCellAdapter(this, mItems);
            recyclerView.setAdapter(mAdater);
        }
    }


    private void makeTestData(){
        mItems.clear();
        WifiCellItem item1 = new WifiCellItem();
        item1.setSsid("wifi-1");
        item1.setIsProtected(true);
        item1.setRssi(-43);
        mItems.add(item1);

        WifiCellItem item2 = new WifiCellItem();
        item2.setSsid("wifi-2");
        item2.setIsProtected(false);
        item2.setRssi(-15);
        mItems.add(item2);

        WifiCellItem item3 = new WifiCellItem();
        item3.setSsid("wifi-3");
        item3.setIsProtected(true);
        item3.setRssi(-81);
        mItems.add(item3);
    }
}
