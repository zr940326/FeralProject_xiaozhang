package my.learnomm.xiaozhang.com.leranomm.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.view.View;

import my.learnomm.xiaozhang.com.leranomm.TitleFragment;

/**
 * Created by zhang on 2016/3/3.
 */
public class ViewPagerAdapter extends PagerAdapter {
    private String[] titelDate;

    public ViewPagerAdapter( String[] titleDate) {

        this.titelDate = titleDate;

    }
    //设置标签显示的标题
    @Override
    public CharSequence getPageTitle(int position) {
        return titelDate[position];  //从这数据集合中取
    }

    //根据选择的值进行布局




    @Override
    public int getCount() {
        return titelDate.length;
    }


    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }
}
