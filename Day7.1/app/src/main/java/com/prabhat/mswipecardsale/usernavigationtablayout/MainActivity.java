package com.prabhat.mswipecardsale.usernavigationtablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v7.widget.Toolbar toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


       /* At the end of the onCreate() method, create an instance of the tab layout from the tab_layout
        element in the layout, and set the text for each tab using addTab():*/

        TabLayout tabLayout = findViewById(R.id.tab_layout);
/*
        Open strings.xml, and create the following string resources:
*/
        tabLayout.addTab(tabLayout.newTab().setText(R.string.tab_label1));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.tab_label2));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.tab_label3));

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

/*
        Below the code you added to the onCreate() method in the previous task, add the following code
        to use PagerAdapter to manage screen (page) views in the fragments:*/

       final ViewPager viewPager=findViewById(R.id.pager);
       final PagerAdapter adapter= new PagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());

       viewPager.setAdapter(adapter);

     /*   At the end of the onCreate() method, set a listener (TabLayoutOnPageChangeListener) to detect if a tab is clicked,
        and create the onTabSelected() method to set the ViewPager to the appropriate tabbed screen.*/

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
