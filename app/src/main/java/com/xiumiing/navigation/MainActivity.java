package com.xiumiing.navigation;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.ashokvarma.bottomnavigation.TextBadgeItem;
import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;
import com.xiumiing.uilibrary.BottomBar;
import com.xiumiing.uilibrary.BottomBarTab;

import java.util.ArrayList;

import static com.ashokvarma.bottomnavigation.BottomNavigationBar.BACKGROUND_STYLE_DEFAULT;
import static com.ashokvarma.bottomnavigation.BottomNavigationBar.MODE_FIXED;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationBar mBootomNavigationBar;
    private CommonTabLayout mCommonTabLayout;
    private BottomBar mBottomBar;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBootomNavigationBar = findViewById(R.id.BottomNavigationBar);
        mCommonTabLayout = findViewById(R.id.commonTabLayout);
        mBottomBar = findViewById(R.id.BottomBar);
        ArrayList<CustomTabEntity> tabEntitys = new ArrayList<>();
        tabEntitys.add(new CustomTabEntity() {
            @Override
            public String getTabTitle() {
                return getString(R.string.home_page);
            }

            @Override
            public int getTabSelectedIcon() {
                return R.mipmap.tab_btn_home_selected;
            }

            @Override
            public int getTabUnselectedIcon() {
                return R.mipmap.tab_btn_home_normal;
            }
        });
        tabEntitys.add(new CustomTabEntity() {
            @Override
            public String getTabTitle() {
                return getString(R.string.loan);
            }

            @Override
            public int getTabSelectedIcon() {
                return R.mipmap.tab_btn_loan_select;
            }

            @Override
            public int getTabUnselectedIcon() {
                return R.mipmap.tab_btn_loan_normal;
            }
        });
        tabEntitys.add(new CustomTabEntity() {
            @Override
            public String getTabTitle() {
                return getString(R.string.tools);
            }

            @Override
            public int getTabSelectedIcon() {
                return R.mipmap.tab_btn_tool_select;
            }

            @Override
            public int getTabUnselectedIcon() {
                return R.mipmap.tab_btn_tool_normal;
            }
        });
        tabEntitys.add(new CustomTabEntity() {
            @Override
            public String getTabTitle() {
                return getString(R.string.my);
            }

            @Override
            public int getTabSelectedIcon() {
                return R.mipmap.tab_btn_me_select;
            }

            @Override
            public int getTabUnselectedIcon() {
                return R.mipmap.tab_btn_me_normal;
            }
        });
        mCommonTabLayout.setTextSelectColor(R.color.colorPrimary);
        mCommonTabLayout.setTextUnselectColor(R.color.gray_gap);
        mCommonTabLayout.setTabData(tabEntitys);
        mCommonTabLayout.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {
                mCommonTabLayout.setCurrentTab(position);
            }

            @Override
            public void onTabReselect(int position) {

            }
        });


        mBottomBar.addItem(new BottomBarTab.Builder(this)
                .setTitle(getString(R.string.home_page))
                .setSelectedIcon(R.mipmap.tab_btn_home_selected)
                .setUnSelectedIcon(R.mipmap.tab_btn_home_normal).create())
                .addItem(new BottomBarTab.Builder(this)
                        .setTitle(getString(R.string.home_page))
                        .setSelectedIcon(R.mipmap.tab_btn_loan_select)
                        .setUnSelectedIcon(R.mipmap.tab_btn_loan_normal).create())
                .addItem(new BottomBarTab.Builder(this)
                        .setTitle(getString(R.string.home_page))
                        .setSelectedIcon(R.mipmap.tab_btn_tool_select)
                        .setUnSelectedIcon(R.mipmap.tab_btn_tool_normal).create())
                .addItem(new BottomBarTab.Builder(this)
                        .setTitle(getString(R.string.home_page))
                        .setSelectedIcon(R.mipmap.tab_btn_me_select)
                        .setUnSelectedIcon(R.mipmap.tab_btn_me_normal).create());


        mBootomNavigationBar.setMode(MODE_FIXED);

        mBootomNavigationBar.setBackgroundStyle(BACKGROUND_STYLE_DEFAULT);

        mBootomNavigationBar
                .addItem(new BottomNavigationItem(R.mipmap.tab_btn_home_selected, getString(R.string.home_page))
//                        .setInactiveIconResource(R.mipmap.tab_btn_home_normal)
                        .setActiveColorResource(R.color.colorPrimary)
                        .setBadgeItem(new TextBadgeItem()
                                .setBorderWidth(4)
                                .setBackgroundColor(Color.RED)
                                .setText("10")
                                .setHideOnSelect(true)))
                .addItem(new BottomNavigationItem(R.mipmap.tab_btn_loan_select, getString(R.string.loan))
//                        .setInactiveIconResource(R.mipmap.tab_btn_loan_normal)
                        .setActiveColorResource(R.color.colorPrimary)
                        .setBadgeItem(new TextBadgeItem()
                                .setBorderWidth(4)
                                .setBackgroundColor(Color.RED)
                                .setText("10")
                                .setHideOnSelect(true)))
                .addItem(new BottomNavigationItem(R.mipmap.tab_btn_tool_select, getString(R.string.tools))
//                        .setInactiveIconResource(R.mipmap.tab_btn_tool_normal)
                        .setActiveColorResource(R.color.colorPrimary)
                        .setBadgeItem(new TextBadgeItem()
                                .setBorderWidth(4)
                                .setBackgroundColor(Color.RED)
                                .setText("10")
                                .setHideOnSelect(true)))
                .addItem(new BottomNavigationItem(R.mipmap.tab_btn_me_select, getString(R.string.my))
//                        .setInactiveIconResource(R.mipmap.tab_btn_me_normal)
                        .setActiveColorResource(R.color.colorPrimary)
                        .setBadgeItem(new TextBadgeItem()
                                .setBorderWidth(4)
                                .setBackgroundColor(Color.RED)
                                .setText("10")
                                .setHideOnSelect(true)))
                .setFirstSelectedPosition(0)
                .initialise();
    }
}
