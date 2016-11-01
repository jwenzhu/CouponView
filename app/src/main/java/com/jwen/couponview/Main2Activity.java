package com.jwen.couponview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.SeekBar;

import com.jwen.couponview.widget.CouponView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {


    @Bind(R.id.couponView)
    CouponView mCouponView;
    @Bind(R.id.semicircle_top)
    CheckBox mSemicircleTop;
    @Bind(R.id.semicircle_bottom) CheckBox mSemicircleBottom;
    @Bind(R.id.semicircle_left) CheckBox mSemicircleLeft;
    @Bind(R.id.semicircle_right) CheckBox mSemicircleRight;
    @Bind(R.id.dash_line_top) CheckBox mDashLineTop;
    @Bind(R.id.dash_line_bottom) CheckBox mDashLineBottom;
    @Bind(R.id.dash_line_left) CheckBox mDashLineLeft;
    @Bind(R.id.dash_line_right) CheckBox mDashLineRight;
    @Bind(R.id.sbSemicircleRadius)
    SeekBar mSbSemicircleRadius;
    @Bind(R.id.sbSemicircleCap) SeekBar mSbSemicircleCap;
    @Bind(R.id.sbDashLineLength) SeekBar mSbDashLineLength;
    @Bind(R.id.sbDashLineGap) SeekBar mSbDashLineGap;
    @Bind(R.id.sbDashLineHeight) SeekBar mSbDashLineHeight;
    @Bind(R.id.sbTopDashLineMargin) SeekBar mSbTopDashLineMargin;
    @Bind(R.id.sbBottomDashLineMargin) SeekBar mSbBottomDashLineMargin;
    @Bind(R.id.sbLeftDashLineMargin) SeekBar mSbLeftDashLineMargin;
    @Bind(R.id.sbRightDashLineMargin) SeekBar mSbRightDashLineMargin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);

        initView();
    }

    public void initView() {
        mSemicircleTop.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mCouponView.setSemicircleTop(isChecked);
            }
        });
        mSemicircleBottom.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mCouponView.setSemicircleBottom(isChecked);
            }
        });
        mSemicircleLeft.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mCouponView.setSemicircleLeft(isChecked);
            }
        });
        mSemicircleRight.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mCouponView.setSemicircleRight(isChecked);
            }
        });

        mDashLineTop.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mCouponView.setDashLineTop(isChecked);
            }
        });
        mDashLineBottom.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mCouponView.setDashLineBottom(isChecked);
            }
        });
        mDashLineLeft.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mCouponView.setDashLineLeft(isChecked);
            }
        });
        mDashLineRight.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mCouponView.setDashLineRight(isChecked);
            }
        });
        mSbSemicircleRadius.setProgress((int) mCouponView.getSemicircleRadius());
        mSbSemicircleRadius.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mCouponView.setSemicircleRadius(dp2Px(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        mSbSemicircleCap.setProgress((int) mCouponView.getSemicircleGap());
        mSbSemicircleCap.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mCouponView.setSemicircleGap(dp2Px(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        mSbDashLineLength.setProgress((int) mCouponView.getDashLineLength());
        mSbDashLineLength.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mCouponView.setDashLineLength(dp2Px(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        mSbDashLineGap.setProgress((int) mCouponView.getDashLineGap());
        mSbDashLineGap.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mCouponView.setDashLineGap(dp2Px(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        mSbDashLineHeight.setProgress((int) mCouponView.getDashLineHeight() * 10);
        mSbDashLineHeight.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mCouponView.setDashLineHeight(dp2Px(progress) / 10);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        mSbTopDashLineMargin.setProgress((int) mCouponView.getDashLineMarginTop());
        mSbTopDashLineMargin.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mCouponView.setDashLineMarginTop(dp2Px(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        mSbBottomDashLineMargin.setProgress((int) mCouponView.getDashLineMarginBottom());
        mSbBottomDashLineMargin.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mCouponView.setDashLineMarginBottom(dp2Px(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        mSbLeftDashLineMargin.setProgress((int) mCouponView.getDashLineMarginLeft());
        mSbLeftDashLineMargin.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mCouponView.setDashLineMarginLeft(dp2Px(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        mSbRightDashLineMargin.setProgress((int) mCouponView.getDashLineMarginRight());
        mSbRightDashLineMargin.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mCouponView.setDashLineMarginRight(dp2Px(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }

    private int dp2Px(float dp) {
        return (int) (dp *getResources().getDisplayMetrics().density + 0.5f);
    }

}
