package example.android.gakuseimeshi.activity.storeInfomation;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import example.android.gakuseimeshi.R;

/**
 * Created by Tomu on 2018/01/27.
 */

public class StoreInfomationActivity extends AppCompatActivity {
    private ViewPager mViewPager;
    public String storeName = "LA TERRA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.store_infomation);
        setTitle(storeName);

        mViewPager = (ViewPager) findViewById(R.id.view_pager);
        mViewPager.setAdapter(new SampleFragmentPagerAdapter(getSupportFragmentManager(), this));

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(mViewPager);
    }
}
