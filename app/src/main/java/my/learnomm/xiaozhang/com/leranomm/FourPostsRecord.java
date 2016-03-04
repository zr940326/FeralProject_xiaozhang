package my.learnomm.xiaozhang.com.leranomm;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class FourPostsRecord extends Activity {
    private ImageView back;
    private ImageView post;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_posts_record);
        back= (ImageView) findViewById(R.id.posts_back_button);
        post= (ImageView) findViewById(R.id.posts_build_post_button);
        //back事件的监听
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FourPostsRecord.this, "返回事件", Toast.LENGTH_SHORT).show();
            }
        });
        //公布栏事件的监听
        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FourPostsRecord.this, "公布栏事件", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
