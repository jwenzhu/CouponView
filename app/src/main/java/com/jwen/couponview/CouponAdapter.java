package com.jwen.couponview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * author: Jwen
 * date:2016-11-01.
 */
public class CouponAdapter extends RecyclerView.Adapter<CouponAdapter.CouponViewHolder>{
    @Override
    public CouponAdapter.CouponViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_coupon,parent,false);
        CouponViewHolder vh = new CouponViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(CouponViewHolder holder, int position) {
        holder.mTextView.setText("RecyclerRefreshLayout" + position);
    }


    @Override
    public int getItemCount() {
        return 20;
    }

    public class CouponViewHolder extends RecyclerView.ViewHolder{
        public TextView mTextView;
        public CouponViewHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.tv_coupon);
        }
    }
}
