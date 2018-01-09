package com.inu.wcl.signage_wifi_helper.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.inu.wcl.signage_wifi_helper.R;
import com.inu.wcl.signage_wifi_helper.etc.Debug;
import com.inu.wcl.signage_wifi_helper.model.WifiCellItem;

import org.w3c.dom.Text;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by HYEONDO-PC on 2018-01-09.
 */

public class WifiCellAdapter extends RecyclerView.Adapter<WifiCellAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<WifiCellItem> mItems;

    public WifiCellAdapter(Context context, ArrayList<WifiCellItem> items) {
        this.mContext = context;
        this.mItems = items;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.item_wifi_ssid)
        TextView ssid;
        @BindView(R.id.item_wifi_rssi)
        TextView rssi;
        @BindView(R.id.item_wifi_state)
        TextView state;


        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    @Override
    public WifiCellAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_wifi_cell, parent, false);
            ViewHolder vh = new ViewHolder(v);
            return vh;
    }

    @Override
    public void onBindViewHolder(WifiCellAdapter.ViewHolder holder, final int position) {
        Debug.LOGD(position + " position   " + mItems.size()+" size  "  +mItems.get(position).getSsid());
        holder.ssid.setText(mItems.get(position).getSsid());
        holder.rssi.setText(mItems.get(position).getRssi()+"");
        if(mItems.get(position).getIsProtected()){
            holder.state.setText("Protected");
        }else{
            holder.state.setText("");
        }
    }
    @Override
    public int getItemCount() {
        return mItems.size();
    }
}
