package my.assignment.applicationthree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;
import android.util.Log;

public class ToggleActivity extends AppCompatActivity {

    ToggleButton mTb;
    ImageView mIv;
    Log log;
    final String TAG="Toggle_Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle);
        mTb=(ToggleButton)findViewById(R.id.toggleButton);
        mIv=(ImageView)findViewById(R.id.imageView);

        mTb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                log.i(TAG,"Entered in click method");

                if(mTb.getText().toString().equals("Hide"))
                    mIv.setVisibility(View.VISIBLE);
                else
                    mIv.setVisibility(View.INVISIBLE);
            }
        });

    }
}
